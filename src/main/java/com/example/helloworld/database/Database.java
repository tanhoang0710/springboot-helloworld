package com.example.helloworld.database;

import com.example.helloworld.models.Product;
import com.example.helloworld.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Database {
    private static final Logger LOGGER = LoggerFactory.getLogger(Database.class);

    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {

        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                Product p1 = new Product("Macbook Pro 16", 2020, 2400.0, "");
//                Product p2 = new Product("Ipad M1", 2022, 1200.0, "");
//                LOGGER.info("Insert data: " + productRepository.save(p1));
//                LOGGER.info("Insert data: " + productRepository.save(p2));
            }
        };
    }
}
