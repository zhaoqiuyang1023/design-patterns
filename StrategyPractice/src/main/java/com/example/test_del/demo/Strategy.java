package com.example.test_del.demo;

import java.math.BigDecimal;

public interface Strategy {

    /**
     * 计算价格
     * @return
     */
    BigDecimal calculatePrice();
}
