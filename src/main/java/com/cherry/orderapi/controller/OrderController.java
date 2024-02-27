package com.cherry.orderapi.controller;


import com.cherry.orderapi.dto.OrderDto;
import com.cherry.orderapi.dto.OrderDtoUi;
import com.cherry.orderapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDto> saveOrderToDb(@RequestBody OrderDtoUi orderDtoUi){

        OrderDto orderDto = orderService.addOrderToDB(orderDtoUi);
        return new ResponseEntity<>(orderDto, HttpStatus.OK);

    }


}
