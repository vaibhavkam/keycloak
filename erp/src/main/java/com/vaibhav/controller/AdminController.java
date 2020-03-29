package com.vaibhav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class AdminController {
    
    @GetMapping("/admin")
    public String get(Principal principal, Model model){
        model.addAttribute("name", principal.getName());
        return "admin";
    }
}
