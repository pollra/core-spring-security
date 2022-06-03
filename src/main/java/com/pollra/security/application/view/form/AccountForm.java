package com.pollra.security.application.view.form;

import lombok.*;

/**
 * @since       2022.06.03
 * @author      pollra
 * @description user form
 **********************************************************************************************************************/
public class AccountForm {
    public static class Request {

        @Getter
        @Setter
        @Builder(toBuilder=true)
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Add {

            private String username;
            private String password;
            private String email;
            private Integer age;
            private String role;
        }
    }
}
