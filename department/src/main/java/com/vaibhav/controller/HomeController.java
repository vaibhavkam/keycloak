package com.vaibhav.controller;

import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    
    @GetMapping("/home")
    public String get(HttpServletRequest request, Model model){
        KeycloakAuthenticationToken principal = (KeycloakAuthenticationToken) request.getUserPrincipal();
        String userId = principal.getAccount().getKeycloakSecurityContext().getIdToken().getSubject();
        model.addAttribute("name", principal.getName());
        model.addAttribute("id", userId);
        return "home";
    }
    
    @GetMapping("/logout")
    public String logout(HttpServletRequest servletRequest) throws ServletException {
        servletRequest.logout();
        return "/home";
    }
}
