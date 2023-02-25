package com.chuwa.redbook.payload.security;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpDto {
    private String name;
    @JsonProperty(value = "account")
    private String account;
    private String email;
    private String password;
}
