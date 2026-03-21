package com.construction.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SiteTeamMember {

    private String id;
    private String name;
    private String role;
    private String bio;
    private String image;
    private String imagePosition;
}
