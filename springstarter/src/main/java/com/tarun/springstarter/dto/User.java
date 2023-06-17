package com.tarun.springstarter.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

//import lombok.Builder;
import lombok.Data;

@Document(collection = "users")
@Data
@Component
public class User {
    @Id
    private String id;
    private String name;
    private int age;
    private String mobileNo;
    private String email;
}
