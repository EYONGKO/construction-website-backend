package com.construction.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "projects")
public class Project {
    
    @Id
    private String id;
    
    @Field("title")
    private String title;
    
    @Field("description")
    private String description;

    @Field("longDescription")
    private String longDescription;

    @Field("location")
    private String location;

    @Field("category")
    private String category;

    @Field("serviceId")
    private String serviceId;

    @Field("serviceTitle")
    private String serviceTitle;
    
    @Field("images")
    private List<String> images;
    
    @Field("completedDate")
    private LocalDate completedDate;
    
    public Project(String title, String description, String longDescription, String location, String category, String serviceId, String serviceTitle, List<String> images, LocalDate completedDate) {
        this.title = title;
        this.description = description;
        this.longDescription = longDescription;
        this.location = location;
        this.category = category;
        this.serviceId = serviceId;
        this.serviceTitle = serviceTitle;
        this.images = images;
        this.completedDate = completedDate;
    }
}
