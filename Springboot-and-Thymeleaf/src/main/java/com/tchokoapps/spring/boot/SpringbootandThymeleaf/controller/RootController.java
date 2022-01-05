package com.tchokoapps.spring.boot.SpringbootandThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RootController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("pageTtitle", "Springboot Thymeleaf");
        model.addAttribute("scientists", List.of("Albert Einstein", "Niels Bohr", "James Clerk Maxwell"));
        return "index";
    }
}
