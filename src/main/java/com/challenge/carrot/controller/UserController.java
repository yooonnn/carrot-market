package com.challenge.carrot.controller;

import com.challenge.carrot.domain.User;
import com.challenge.carrot.dto.SignupRequestDto;
import com.challenge.carrot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public void registerUser(@RequestBody SignupRequestDto signupRequestDto) {
        userService.registerUser(signupRequestDto);
    }

    @GetMapping("/user")
    public List<User> getUser() {
        List<User> users = userService.getUser();
        return users;
    }
}
