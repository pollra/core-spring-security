package com.pollra.security.application.view.service;

import com.pollra.security.application.config.security.entity.Account;
import com.pollra.security.application.view.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @since       2022.06.03
 * @author      pollra
 * @description account service
 **********************************************************************************************************************/
@Service
@Transactional
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;

    public Account add(Account account) {
        String encodePassword = passwordEncoder.encode(account.getPassword());
        account.setPassword(encodePassword);
        return accountRepository.save(account);
    }
}
