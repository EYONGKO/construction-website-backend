package com.construction.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "quote_requests")
public class QuoteRequest {
    
    @Id
    private String id;
    
    @Field("name")
    private String name;
    
    @Field("email")
    private String email;
    
    @Field("phone")
    private String phone;
    
    @Field("projectType")
    private String projectType;
    
    @Field("description")
    private String description;
    
    @Field("createdAt")
    private LocalDateTime createdAt;
    
    public QuoteRequest(String name, String email, String phone, String projectType, String description) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.projectType = projectType;
        this.description = description;
        this.createdAt = LocalDateTime.now();
    }
}
