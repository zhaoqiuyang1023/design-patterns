package com.example.test_del.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@SpringBootApplication
public class DemoApplication {



    @Autowired
    private StrategyContext strategyContext;

    @RequestMapping("calculatePrice")
    public BigDecimal calculatePrice(String memberLevel) {
        return strategyContext.calculatePrice(memberLevel);
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
