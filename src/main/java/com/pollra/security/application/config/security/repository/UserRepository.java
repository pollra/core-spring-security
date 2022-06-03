package com.pollra.security.application.config.security.repository;

import com.pollra.security.application.config.security.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @since       2022.06.03
 * @author      pollra
 * @description user repository
 **********************************************************************************************************************/
@Repository
public interface UserRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
