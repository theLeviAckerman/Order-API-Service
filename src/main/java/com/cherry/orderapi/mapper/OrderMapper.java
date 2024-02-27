package com.cherry.orderapi.mapper;


import com.cherry.orderapi.dto.OrderDto;
import com.cherry.orderapi.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDtotoorder(OrderDto orderDto);
    OrderDto mapOrderToOrderDto(Order order);
}
