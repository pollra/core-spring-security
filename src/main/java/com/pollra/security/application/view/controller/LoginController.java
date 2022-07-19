package com.pollra.security.application.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @since       2022.07.19
 * @author      pollra
 * @description login controller
 **********************************************************************************************************************/
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "user/login/login";
    }
}
