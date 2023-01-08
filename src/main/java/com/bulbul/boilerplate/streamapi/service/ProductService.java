package com.bulbul.boilerplate.streamapi.service;


import com.bulbul.boilerplate.streamapi.entity.Order;
import com.bulbul.boilerplate.streamapi.entity.OrderDto;
import com.bulbul.boilerplate.streamapi.entity.Product;
import com.bulbul.boilerplate.streamapi.entity.ProductDto;
import com.bulbul.boilerplate.streamapi.repository.OrderRepository;
import com.bulbul.boilerplate.streamapi.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;
    public List<ProductDto> getProductList() {
       return getProductListFilerByCategoryAndPrice();
    }


    //Exercise 1 — Obtain a list of products belongs to category “Books” with price > 5 tk
    List<ProductDto> getProductListFilerByCategoryAndPrice(){
        List<Product> products = productRepository.findAll()
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .filter(p ->p.getPrice()>30)
                .toList();
        return products.stream().map(p -> new ProductDto(
                p.getName(),p.getCategory(),p.getPrice())).collect(Collectors.toList());
    }

    //Exercise 2 — Obtain a list of order with products belong to category “Baby”
    List<OrderDto> getProductListFilerByCategory(){
        List<Order> result = orderRepository.findAll()
                .stream()
                .filter(o ->
                        o.getProducts()
                                .stream()
                                .anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby"))
                )
                .collect(Collectors.toList());
        return result.stream().map(o -> new OrderDto(
                o.getOrderDate(),o.getDeliveryDate(),o.getStatus(),o.getCustomer().getName(),o.getProducts())).collect(Collectors.toList());
    }

    // Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount
    List<ProductDto> getProductListFilerByCategoryAndApplyDiscount(){
        List<Product> products = productRepository.findAll()
                .stream()
                .filter(product -> product.getCategory().equals("Toys"))
                .map(product -> {
                    product.setPrice(product.getPrice() * 0.9); // Apply 10% discount
                    return product;
                })
                .collect(Collectors.toList());
        return products.stream().map(p -> new ProductDto(
                p.getName(),p.getCategory(),p.getPrice())).collect(Collectors.toList());
    }

}
