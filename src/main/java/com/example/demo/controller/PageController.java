package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam(name="id", required=false, defaultValue="10") int id, Model model) {
        model.addAttribute("id", id);
        return "detail";
    }
}
