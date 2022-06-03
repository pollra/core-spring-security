package com.pollra.security.application.view.mapper;

import com.pollra.security.application.config.security.entity.Account;
import com.pollra.security.application.view.form.AccountForm;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * @since       2022.06.03
 * @author      pollra
 * @description account mapper
 **********************************************************************************************************************/
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AccountMapper {

    AccountMapper mapper = Mappers.getMapper(AccountMapper.class);

    Account toAccount(AccountForm.Request.Add add);
}
