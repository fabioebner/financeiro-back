package br.com.lumera.financeiroback.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/")
    public String login(){
        return "foi Login";
    }

    @PostMapping("/")
    public boolean login(String username, String password){
        return true;
    }


}