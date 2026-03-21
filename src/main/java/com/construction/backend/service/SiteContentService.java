package com.construction.backend.service;

import com.construction.backend.model.SiteContent;
import com.construction.backend.model.SiteTeamMember;
import com.construction.backend.repository.SiteContentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SiteContentService {

    private static final String SITE_CONTENT_ID = "main";
    private final SiteContentRepository siteContentRepository;

    public SiteContent getSiteContent() {
        return siteContentRepository.findById(SITE_CONTENT_ID)
                .orElseGet(() -> siteContentRepository.save(buildDefaultContent()));
    }

    public SiteContent updateSiteContent(SiteContent siteContent) {
        siteContent.setId(SITE_CONTENT_ID);
        return siteContentRepository.save(siteContent);
    }

    private SiteContent buildDefaultContent() {
        return new SiteContent(
                SITE_CONTENT_ID,
                "CEBAT Construction",
                "Construction and Technical Services",
                "Yaounde, Cameroon",
                "+237 6 99 52 91 61",
                "info@cebatconstruction.com",
                "Mon - Sat: 7:30 AM - 7:00 PM",
                "Your trusted partner for construction, electrical solutions, and technical services in Yaounde, Cameroon. We bring quality and structure to every project.",
                "https://www.facebook.com/",
                "https://wa.me/237699529161",
                "https://www.linkedin.com/",
                "Brightening Yaounde with Quality and Style",
                "Your trusted partner for construction, electrical solutions, and technical services in Cameroon. From solar installations to building construction, we bring expertise to every project.",
                "/images/home-hero.jpg",
                "Technical and construction services built for quality delivery.",
                "We provide dependable execution across solar, electrical, painting, plumbing, POP installation, and building services for clients across Cameroon.",
                "/images/services-hero.jpg",
                "Browse our products catalog and featured technical supplies.",
                "Explore quality construction and electrical supplies presented in a cleaner, product-focused layout.",
                "/images/products-hero.jpg",
                "Meet the team behind our construction and technical delivery.",
                "We help clients deliver construction and technical projects with a practical approach, strong supervision, and a professional finish.",
                "/images/team-hero.jpg",
                "Talk to our team about your next construction or technical project.",
                "Reach out for consultations, quotations, product enquiries, and project planning support.",
                "/images/contact-hero.jpg",
                "Get your quote for construction, technical, and finishing projects.",
                "Send us your project details and our team will review the scope, advise on the right service, and respond with a quote.",
                "/images/quote-hero.jpg",
                "Ready to Start Your Project?",
                "Contact us today for a free consultation and quote. Our team is ready to help you with all your construction and electrical needs.",
                List.of(
                        new SiteTeamMember("martin-ebong", "Martin Ebong", "Managing Director", "Leads project strategy, client coordination, and execution standards across CEBAT Construction delivery teams.", "/images/team-hero.jpg", "center 18%"),
                        new SiteTeamMember("grace-nkeng", "Grace Nkeng", "Operations and Site Supervisor", "Coordinates site activities, workforce planning, and day-to-day delivery to keep projects organized and on schedule.", "/images/team-hero.jpg", "center 42%"),
                        new SiteTeamMember("daniel-fon", "Daniel Fon", "Technical Services Lead", "Oversees solar, electrical, plumbing, and finishing installations with a strong focus on safety and quality workmanship.", "/images/team-hero.jpg", "center 68%")
                )
        );
    }
}
