package com.ws.example.demows.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ws.example.demows.model.Welcome;

@Controller
public class WelcomeController {
private static final String welcomemsg = "Bem vindo %s!";
	
//EXEMPLO RESTFull GET
	@GetMapping("/welcome/user")
    @ResponseBody   
    public Welcome welcomeUser(@RequestParam(name="name", required=false, defaultValue="Java Fan") String name) {
        return new Welcome(String.format(welcomemsg, name));
    }
	
	
}
