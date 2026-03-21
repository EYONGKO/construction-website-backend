package com.construction.backend.service;

import com.construction.backend.model.QuoteRequest;
import com.construction.backend.repository.QuoteRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuoteRequestService {

    private final QuoteRequestRepository quoteRequestRepository;

    public QuoteRequest createQuoteRequest(QuoteRequest quoteRequest) {
        if (quoteRequest.getCreatedAt() == null) {
            quoteRequest.setCreatedAt(LocalDateTime.now());
        }

        return quoteRequestRepository.save(quoteRequest);
    }

    public List<QuoteRequest> getAllQuoteRequests() {
        return quoteRequestRepository.findAll();
    }
}
