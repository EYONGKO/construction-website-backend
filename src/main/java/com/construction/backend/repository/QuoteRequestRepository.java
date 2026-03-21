package com.construction.backend.repository;

import com.construction.backend.model.QuoteRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRequestRepository extends MongoRepository<QuoteRequest, String> {
}
