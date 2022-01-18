package com.challenge.carrot.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class SignupRequestDto {
    private String email;
    private String password;
    private String username;
    private String number;
    private String nickname;
}
