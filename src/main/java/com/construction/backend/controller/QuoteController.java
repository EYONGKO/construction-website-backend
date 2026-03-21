package com.construction.backend.controller;

import com.construction.backend.model.QuoteRequest;
import com.construction.backend.service.QuoteRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
public class QuoteController {

    private final QuoteRequestService quoteRequestService;

    @PostMapping("/quotes")
    public ResponseEntity<QuoteRequest> createQuoteRequest(@RequestBody QuoteRequest quoteRequest) {
        return ResponseEntity.ok(quoteRequestService.createQuoteRequest(quoteRequest));
    }

    @GetMapping("/quotes")
    public ResponseEntity<List<QuoteRequest>> getAllQuoteRequests() {
        return ResponseEntity.ok(quoteRequestService.getAllQuoteRequests());
    }
}
