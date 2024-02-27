package com.cherry.orderapi.entity;


import com.cherry.orderapi.dto.MenuDto;
import com.cherry.orderapi.dto.Restaurant;
import com.cherry.orderapi.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document("order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

     private Integer orderId;
     private List<MenuDto> menuDtoList;
     private UserDto userDto;
     private Restaurant restaurant;




}
