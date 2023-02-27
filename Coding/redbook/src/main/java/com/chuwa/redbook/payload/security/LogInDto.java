package com.chuwa.redbook.payload.security;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogInDto {
    @JsonProperty("accountOrEmail")
    private String accountOrEmail;
    private String password;
}
