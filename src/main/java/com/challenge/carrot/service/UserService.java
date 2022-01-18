package com.challenge.carrot.service;

import com.challenge.carrot.domain.User;
import com.challenge.carrot.dto.SignupRequestDto;
import com.challenge.carrot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

//    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder){
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }

    public User registerUser(SignupRequestDto signupRequestDto){
        String email = signupRequestDto.getEmail();
        // 회원 email 중복 확인
        Optional<User> found = userRepository.findByEmail(email);
        if (found.isPresent()) {
            throw new IllegalArgumentException("중복된 email 이 존재합니다.");
        }

        String password = passwordEncoder.encode(signupRequestDto.getPassword());
        String username = signupRequestDto.getUsername();
        String number = signupRequestDto.getNumber();
        String nickname = signupRequestDto.getNickname();

        User user = new User(email, password, username, number, nickname);
        userRepository.save(user);

        return user;
    }

    public List<User> getUser(){
        return userRepository.findAll();
    }
}
