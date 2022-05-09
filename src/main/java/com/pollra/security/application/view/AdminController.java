package com.pollra.security.application.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @since       2022.05.09
 * @author      pollra
 * @description admin controller
 **********************************************************************************************************************/
@Controller
public class AdminController {

    @GetMapping(value="/config")
    public String home() throws Exception {
        return "admin/config";
    }

}
