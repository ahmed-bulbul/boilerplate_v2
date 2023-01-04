package com.bulbul.boilerplate.streamapi.seed;

import com.bulbul.boilerplate.streamapi.entity.Customer;
import com.bulbul.boilerplate.streamapi.repository.CustomerRepository;
import com.bulbul.boilerplate.streamapi.repository.OrderRepository;
import com.bulbul.boilerplate.streamapi.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public  class StreamApiSeeder {

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;

    public void create(){

        if(!(customerRepository.findAll().size() >0)){
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


    }

}
