package com.construction.backend.controller;

import com.construction.backend.model.SiteContent;
import com.construction.backend.service.SiteContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/site-content")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
public class SiteContentController {

    private final SiteContentService siteContentService;

    @GetMapping
    public ResponseEntity<SiteContent> getSiteContent() {
        return ResponseEntity.ok(siteContentService.getSiteContent());
    }

    @PutMapping
    public ResponseEntity<SiteContent> updateSiteContent(@RequestBody SiteContent siteContent) {
        return ResponseEntity.ok(siteContentService.updateSiteContent(siteContent));
    }
}
