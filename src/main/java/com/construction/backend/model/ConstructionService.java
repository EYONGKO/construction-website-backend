package com.construction.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "services")
public class ConstructionService {
    
    @Id
    private String id;
    
    @Field("title")
    private String title;
    
    @Field("description")
    private String description;
    
    @Field("icon")
    private String icon;

    @Field("image")
    private String image;
    
    public ConstructionService(String title, String description, String icon) {
        this.title = title;
        this.description = description;
        this.icon = icon;
    }

    public ConstructionService(String title, String description, String icon, String image) {
        this.title = title;
        this.description = description;
        this.icon = icon;
        this.image = image;
    }
}
