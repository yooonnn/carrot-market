package com.challenge.carrot.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String token;
    private String email;
    private String username;
    private String password;
    private String id;
    private String number;
    private String nickname;


}
