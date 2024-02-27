package com.cherry.orderapi.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {



    private int id;

    private String userName;
    private  String userPassword;

    private  String address;

    private String city;


}
