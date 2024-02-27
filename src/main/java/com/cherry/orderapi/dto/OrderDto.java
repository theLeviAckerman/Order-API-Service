package com.cherry.orderapi.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

     private Integer orderId;

     private List<MenuDto> menuDtoList;

     private UserDto userDto;
     private Restaurant restaurant;



}
