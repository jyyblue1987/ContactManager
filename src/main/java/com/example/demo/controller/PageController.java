package com.example.demo.controller;

import com.example.demo.model.Contact;
import com.example.demo.service.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class PageController {
    @Autowired
    IContactService contactService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam(name="id", required=false, defaultValue="10") Long id, Model model) {
//        var contacts = (List<Contact>) contactService.findById(id);
//        model.addAttribute("id", contacts.get(0).getFull_name());
        var val = contactService.findById(id);
        if( val.isPresent() ) {
            Contact contact = (Contact) val.get();
            model.addAttribute("model", contact);
        }
        else
        {
            model.addAttribute("email", 0);
        }

        return "detail";
    }
}
