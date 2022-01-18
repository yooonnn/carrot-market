package com.challenge.carrot.repository;

import com.challenge.carrot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
//    Optional<User> findByKakaoId(Long kakaoId);
}