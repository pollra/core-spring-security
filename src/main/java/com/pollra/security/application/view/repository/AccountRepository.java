package com.pollra.security.application.view.repository;

import com.pollra.security.application.config.security.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @since       2022.06.03
 * @author      pollra
 * @description account repository
 **********************************************************************************************************************/
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
