package com.construction.backend.repository;

import com.construction.backend.model.SiteContent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteContentRepository extends MongoRepository<SiteContent, String> {
}
