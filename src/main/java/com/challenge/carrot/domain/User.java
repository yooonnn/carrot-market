package com.challenge.carrot.domain;

import com.challenge.carrot.dto.SignupRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String username;

    @Column
    private String number;

    @Column
    private String nickname;

    public User(String email, String password, String username, String number, String nickname){
        this.email = email;
        this.password = password;
        this.username = username;
        this.number = number;
        this.nickname = nickname;
    }

}
