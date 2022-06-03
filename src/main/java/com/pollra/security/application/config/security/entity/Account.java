package com.pollra.security.application.config.security.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @since       2022.06.03
 * @author      pollra
 * @description account
 **********************************************************************************************************************/
@Entity
@EqualsAndHashCode(of = "id")
@Table(name = "account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    private Integer age;

    private String password;

    private String role;
}
