package com.example.demo.controller;

import com.example.demo.model.Contact;
import com.example.demo.service.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestApiController {
    @Autowired
    private IContactService contactService;

    @GetMapping("/contacts")
    public List<Contact> allContacts() {
        return contactService.findAll();
    }

}
