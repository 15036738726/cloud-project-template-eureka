package org.example.controller;

import org.example.domain.Order;
import org.example.feign.UserOrderFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserOrderFeign userOrderFeign;

    /**
     * http://localhost:8080/find
     * @return
     */
    @GetMapping("find")
    public String find(){
        Order result = userOrderFeign.getOrderByUserId(1);
        return result.toString();
    }
}
