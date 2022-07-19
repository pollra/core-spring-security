package com.pollra.security.application.view.controller;

import com.pollra.security.application.view.form.AccountForm;
import com.pollra.security.application.view.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.pollra.security.application.view.mapper.AccountMapper.mapper;

/**
 * @since       2022.05.09
 * @author      pollra
 * @description user controller
 **********************************************************************************************************************/
@Controller
@RequiredArgsConstructor
public class UserController {

    private final AccountService accountService;

    @GetMapping("/mypage")
    public String myPage() {
        return "user/mypage";
    }

    @GetMapping("/users")
    public String signin() {
        return "user/login/register";
    }

    @PostMapping("/users")
    public String add(AccountForm.Request.Add add) {
        accountService.add(mapper.toAccount(add));
        return "home";
    }
}
