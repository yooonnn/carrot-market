package com.challenge.carrot.domain;

import com.challenge.carrot.dto.ProductRequestDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String price;

    @Column(nullable = false)
    private String content;
//
//    @Column(nullable = false)
//    private String nickname;

    @JsonIgnoreProperties({"products"})
    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "user_id", nullable = false)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public ProductEntity(ProductRequestDto productRequestDto) {
        this.title = productRequestDto.getTitle();
        this.category = productRequestDto.getCategory();
        this.price = productRequestDto.getPrice();
        this.content = productRequestDto.getContent();
    }

}
