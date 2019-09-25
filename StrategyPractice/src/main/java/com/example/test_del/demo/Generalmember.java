package com.example.test_del.demo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Generalmember implements Strategy {

    @Override
    public BigDecimal calculatePrice() {
        // 普通会员没有折扣，直接返回原价
        return new BigDecimal("100");
    }
}
