package com.bulbul.boilerplate.streamapi.entity;

import lombok.Data;

@Data
public class ProductDto {

        private String name;
        private String category;
        private double price;

    public ProductDto(String name, String category, Double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
}
