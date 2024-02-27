package com.cherry.orderapi.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDtoUi {

     private List<MenuDto> menuDtoList;
     private Integer userId;
     private Restaurant restaurant;




}
