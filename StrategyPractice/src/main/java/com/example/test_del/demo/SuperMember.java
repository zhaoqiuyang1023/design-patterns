package com.example.test_del.demo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component("superMember")
public class SuperMember implements Strategy {
    @Override
    public BigDecimal calculatePrice() {
        // 超级会员打1折
        System.out.println("超级会员打1折");
        return new BigDecimal("10");
    }
}
