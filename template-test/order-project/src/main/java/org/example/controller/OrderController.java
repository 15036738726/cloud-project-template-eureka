package org.example.controller;

import org.example.domain.Order;
import org.example.feign.UserOrderFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController implements UserOrderFeign {

    /**
     * http://localhost:8081/order/getOrderByUserId?id=1
     * @param id
     * @return
     */
    @Override
    public Order getOrderByUserId(Integer id) {
        // 执行serivce层操作
        Order order = Order.builder().id(1111).name("新订单").build();
        return order;
    }

    /**
     * http://localhost:8081/test
     * @return
     */
    @GetMapping("test")
    public String test(){
        return "111";
    }
}
