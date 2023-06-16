package com.tarun.springstarter.dto;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data
@Document(collection = "userDetails")
public class UserDto {

    @Indexed
    private int id;
    private String name;

}
