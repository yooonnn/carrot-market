package com.challenge.carrot.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class ProductRequestDto {
    private String title;
    private String category;
    private String price;
    private String content;
//    private String nickname;
}
