package com.Techietk.Springsecurity_JWTF.Auth;

import com.Techietk.Springsecurity_JWTF.Model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Role role;
}
