package com.construction.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "siteContent")
public class SiteContent {

    @Id
    private String id;

    @Field("companyName")
    private String companyName;

    @Field("companyTagline")
    private String companyTagline;

    @Field("address")
    private String address;

    @Field("phone")
    private String phone;

    @Field("email")
    private String email;

    @Field("businessHours")
    private String businessHours;

    @Field("footerDescription")
    private String footerDescription;

    @Field("facebookUrl")
    private String facebookUrl;

    @Field("whatsappUrl")
    private String whatsappUrl;

    @Field("linkedinUrl")
    private String linkedinUrl;

    @Field("homeHeroTitle")
    private String homeHeroTitle;

    @Field("homeHeroText")
    private String homeHeroText;

    @Field("homeHeroImage")
    private String homeHeroImage;

    @Field("servicesIntroTitle")
    private String servicesIntroTitle;

    @Field("servicesIntroText")
    private String servicesIntroText;

    @Field("servicesHeroImage")
    private String servicesHeroImage;

    @Field("productsIntroTitle")
    private String productsIntroTitle;

    @Field("productsIntroText")
    private String productsIntroText;

    @Field("productsHeroImage")
    private String productsHeroImage;

    @Field("aboutBannerTitle")
    private String aboutBannerTitle;

    @Field("aboutBannerText")
    private String aboutBannerText;

    @Field("aboutHeroImage")
    private String aboutHeroImage;

    @Field("contactBannerTitle")
    private String contactBannerTitle;

    @Field("contactBannerText")
    private String contactBannerText;

    @Field("contactHeroImage")
    private String contactHeroImage;

    @Field("quoteBannerTitle")
    private String quoteBannerTitle;

    @Field("quoteBannerText")
    private String quoteBannerText;

    @Field("quoteHeroImage")
    private String quoteHeroImage;

    @Field("ctaTitle")
    private String ctaTitle;

    @Field("ctaText")
    private String ctaText;

    @Field("teamMembers")
    private List<SiteTeamMember> teamMembers;
}
