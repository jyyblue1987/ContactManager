package com.example.demo.controller;

import com.example.demo.model.Contact;
import com.example.demo.service.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Rest Api Handler
@RestController
public class RestApiController {
    @Autowired
    private IContactService contactService;

    @GetMapping("/contacts")
    public List<Contact> allContacts() {
        return contactService.findAll();
    }

    @GetMapping("/contact")
    public Contact contact(@RequestParam(name="id", required=false, defaultValue="10") Long id) {
        var val = contactService.findById(id);
        if( val.isPresent() ) {
            Contact contact = (Contact) val.get();
            return contact;
        }

        return new Contact();
    }

}
