package com.example.demo.controller;

import com.example.demo.service.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {
    @Autowired
    IContactService contactService;

    // Contact List Page
    @GetMapping("/")
    public String index() {
        return "index"; // load index.html
    }

    // Contact Detail Page
    @GetMapping("/detail")
    public String detail(@RequestParam(name="id", required=false, defaultValue="10") Long id, Model model) {
        return "detail"; // load detail.html
    }
}
