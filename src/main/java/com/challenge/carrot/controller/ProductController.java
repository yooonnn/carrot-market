package com.challenge.carrot.controller;

import com.challenge.carrot.domain.ProductEntity;
import com.challenge.carrot.dto.ProductRequestDto;
import com.challenge.carrot.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @PostMapping("/product")
    public ProductEntity createProduct(@RequestBody ProductRequestDto productRequestDto) throws IOException {
        System.out.println(productRequestDto.getCategory());
        System.out.println(productRequestDto.getContent());
        System.out.println(productRequestDto.getPrice());
        System.out.println(productRequestDto.getTitle());
        return productService.createProduct(productRequestDto);

    }
}
