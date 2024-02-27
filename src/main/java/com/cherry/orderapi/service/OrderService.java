package com.cherry.orderapi.service;


import com.cherry.orderapi.dto.OrderDto;
import com.cherry.orderapi.dto.OrderDtoUi;
import com.cherry.orderapi.dto.UserDto;
import com.cherry.orderapi.entity.Order;
import com.cherry.orderapi.mapper.OrderMapper;
import com.cherry.orderapi.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    SequenceGenerator sequenceGenerator;

    @Autowired
    RestTemplate restTemplate;



    public OrderDto addOrderToDB(OrderDtoUi orderDtoUi) {
        Integer nextOrderId = sequenceGenerator.generateNextOrderId();
        UserDto userDto = fetchUserDetails(orderDtoUi.getUserId());
        Order orderToBeSaved = new Order(nextOrderId, orderDtoUi.getMenuDtoList(), userDto, orderDtoUi.getRestaurant());
        orderRepo.save(orderToBeSaved);

        return  OrderMapper.INSTANCE.mapOrderToOrderDto(orderToBeSaved);


    }

    private UserDto fetchUserDetails(Integer userId) {

        return restTemplate.getForObject("http://USER-SERVICE/user/getUserById/" + userId, UserDto.class);
    }
}
