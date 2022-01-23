package com.challenge.carrot.service;

import com.challenge.carrot.domain.ProductEntity;
import com.challenge.carrot.dto.ProductRequestDto;
import com.challenge.carrot.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.io.IOException;

@RequiredArgsConstructor
@Service
public class ProductService{

    private final ProductRepository productRepository;

//    @Transactional
    public ProductEntity createProduct(ProductRequestDto productRequestDto){
        System.out.println("서비스" + productRequestDto.getTitle());

        ProductEntity product = new ProductEntity(productRequestDto);
        productRepository.save(product);
        return product;
    }
}
