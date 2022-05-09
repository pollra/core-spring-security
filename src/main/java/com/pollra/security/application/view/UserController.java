package com.pollra.security.application.view;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * @since       2022.05.09
 * @author      pollra
 * @description user controller
 **********************************************************************************************************************/
@Controller
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/mypage")
    public String myPage() {
        return "user/mypage";
    }
}
