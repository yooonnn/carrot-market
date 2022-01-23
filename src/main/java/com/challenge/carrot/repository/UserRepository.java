package com.challenge.carrot.repository;

import com.challenge.carrot.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
//    Optional<User> findByEmail(String email);
//    Optional<User> findByKakaoId(Long kakaoId);
    UserEntity findByEmail(String email);
    Boolean existsByEmail(String email);
    UserEntity findByEmailAndPassword(String email, String password);
}
