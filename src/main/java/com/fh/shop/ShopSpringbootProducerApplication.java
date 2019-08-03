package com.fh.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fh.shop.mapper")

public class ShopSpringbootProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopSpringbootProducerApplication.class, args);
    }

}
