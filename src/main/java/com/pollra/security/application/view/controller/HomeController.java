package com.pollra.security.application.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @since       2022.05.10
 * @author      pollra
 * @description home controller
 **********************************************************************************************************************/
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
