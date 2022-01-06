package com.tchokoapps.spring.boot.SpringbootandThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teams")
public class TeamController {
    @GetMapping
    public String list(Model model) {
        return "teams/list";
    }

}
