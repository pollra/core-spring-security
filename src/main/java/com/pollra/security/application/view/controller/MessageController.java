package com.pollra.security.application.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @since       2022.05.10
 * @author      pollra
 * @description message controller
 **********************************************************************************************************************/
@Controller
public class MessageController {

    @GetMapping("/messages")
    public String myPage() {
        return "user/messages";
    }
}
