package org.example.feign.hystrix;

import org.example.domain.Order;
import org.example.feign.UserOrderFeign;
import org.springframework.stereotype.Component;

@Component
public class UserOrderFeignHystrix implements UserOrderFeign {
    @Override
    public Order getOrderByUserId(Integer id) {
        return Order.builder().id(1).name("默认订单").build();
    }
}
