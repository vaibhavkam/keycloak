package com.vaibhav.controller;

import com.vaibhav.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class UserController {
    
    @Autowired
    UserService userService;
    
    @GetMapping("/user")
    public String get(Principal principal, Model model){
        model.addAttribute("name", principal.getName());
        model.addAttribute("departments", userService.getUserDepartments());
        return "user";
    }
}
