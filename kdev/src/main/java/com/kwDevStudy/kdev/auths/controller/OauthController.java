package com.kwDevStudy.kdev.auths.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class OauthController {

    @GetMapping("/login")
    public String loginPage() {
        return "";
    }

    @PostMapping("/login")
    public String login() {
        return "";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "";
    }

    @PostMapping("/register")
    public String register() {
        return "";
    }


}
