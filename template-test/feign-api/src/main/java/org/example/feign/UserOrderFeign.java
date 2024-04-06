package org.example.feign;


import org.example.domain.Order;
import org.example.feign.hystrix.UserOrderFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "order-service",fallback = UserOrderFeignHystrix.class)
public interface UserOrderFeign {
    @GetMapping("order/getOrderByUserId")
    Order getOrderByUserId(@RequestParam("id") Integer id);
}
