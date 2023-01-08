package com.bulbul.boilerplate.streamapi.seed;

import com.bulbul.boilerplate.streamapi.entity.Customer;
import com.bulbul.boilerplate.streamapi.entity.Order;
import com.bulbul.boilerplate.streamapi.entity.Product;
import com.bulbul.boilerplate.streamapi.repository.CustomerRepository;
import com.bulbul.boilerplate.streamapi.repository.OrderRepository;
import com.bulbul.boilerplate.streamapi.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public  class StreamApiSeeder {

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;

    public void createCustomer(){

        if (customerRepository.findAll().size() > 0) {
            return;
        }
        for(int x=0;x<50;x++){

            String randomName = UUID.randomUUID()
                    .toString()
                    .substring(0, 5);
            Random random = new Random();
            Integer randomTire = random.nextInt(50);
            Customer customer = new Customer();
            customer.setName(randomName);
            customer.setTier(randomTire);
            customerRepository.save(customer);
        }


    }

    //create product
    public void createProduct(){
        if(!productRepository.findAll().isEmpty()){
            return;
        }
        String[] category = {"Electronics","Books","Baby","Books","Sports","Toys","Furniture","Tools","Garden","Automotive"};
        for(int x=0;x<50;x++){
            String randomName = UUID.randomUUID()
                    .toString()
                    .substring(0, 5);
            Random random = new Random();
            Double randomPrice = random.nextDouble(50);
            Product product = new Product();
            product.setName(randomName);
            product.setCategory(category[random.nextInt(10)]);
            product.setPrice(randomPrice);
            productRepository.save(product);
        }

    }
    //set up a order
    public void createOrder(){
        if(!orderRepository.findAll().isEmpty()){
            return;
        }
        for(int x=0;x<50;x++){
            LocalDate randomLocalDate   = LocalDate.now();
            Random random = new Random();
            Integer randomStatus = random.nextInt(50);
            Order order = new Order();
            order.setOrderDate(randomLocalDate);
            order.setDeliveryDate(randomLocalDate);
            order.setStatus(randomStatus.toString());
            order.setCustomer(customerRepository.findAll().get(x));
            order.setProducts(productRepository.findAll().stream().limit(5).collect(Collectors.toSet()));
            orderRepository.save(order);
        }

    }



}