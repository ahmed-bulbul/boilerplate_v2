package com.bulbul.boilerplate.streamapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
public class OrderDto {

        private LocalDate orderDate;
        private LocalDate deliveryDate;
        private String status;
        private String customerName;
        private List<ProductDto> productDtos;

    public OrderDto(LocalDate orderDate, LocalDate deliveryDate, String status, String customerName, Set<Product> products) {
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.customerName = customerName;
        this.productDtos = products.stream().map(product -> new ProductDto(product.getName(),
                product.getCategory(), product.getPrice())).toList();
    }
}
