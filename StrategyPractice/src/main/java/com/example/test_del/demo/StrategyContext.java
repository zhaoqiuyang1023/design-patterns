package com.example.test_del.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class StrategyContext {
    private final Map<String, Strategy> strategyMap = new ConcurrentHashMap<>();

//    /**
//     * 注入所以实现了Strategy接口的Bean
//     *
//     * @param strategyList
//     */
//    @Autowired
//    public StrategyContext(Set<Strategy> strategyList) {
//        strategyMap.clear();
//        System.out.println(strategyList);
//        Integer index = 0;
//        for (Strategy strategy : strategyList) {
//            strategyMap.put(index.toString(), strategy);
//            index++;
//            System.out.println(index);
//        }
//    }

//    /**
//     * 注入所以实现了Strategy接口的Bean
//     *
//     * @param strategyMap
//     */
    @Autowired
    public StrategyContext(Map<String, Strategy> strategyMap) {
        this.strategyMap.clear();
        System.out.println("初始化");
        System.out.println(strategyMap);
        strategyMap.forEach((k, v)->System.out.println(k));
        strategyMap.forEach((k, v) -> this.strategyMap.put(k, v));
    }

    /**
     * 计算价格
     *
     * @param memberLevel 会员等级
     * @return 价格
     */
    public BigDecimal calculatePrice(String memberLevel) {
        return strategyMap.get(memberLevel).calculatePrice();
    }
}
