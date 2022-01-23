package com.challenge.carrot.domain;

import com.challenge.carrot.dto.SignupRequestDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class UserEntity {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String number;

    @Column(nullable = false)
    private String nickname;

    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
    private List<ProductEntity> products;

//    public User(String email, String password, String username, String number, String nickname){
//        this.email = email;
//        this.password = password;
//        this.username = username;
//        this.number = number;
//        this.nickname = nickname;
//    }

}
