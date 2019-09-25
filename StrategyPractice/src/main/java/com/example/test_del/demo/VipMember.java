package com.example.test_del.demo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component("vipMember")
public class VipMember implements Strategy {
    @Override
    public BigDecimal calculatePrice() {
        // VIP会员打8折
        return new BigDecimal("80");
    }
}
