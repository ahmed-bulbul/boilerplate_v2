package com.bulbul.boilerplate.streamapi.controller;

import com.bulbul.boilerplate.streamapi.entity.Product;
import com.bulbul.boilerplate.streamapi.entity.ProductDto;
import com.bulbul.boilerplate.streamapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/list")
    public List<ProductDto> getProductList(){
        return productService.getProductList();
    }

}
