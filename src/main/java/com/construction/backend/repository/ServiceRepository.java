package com.construction.backend.repository;

import com.construction.backend.model.ConstructionService;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends MongoRepository<ConstructionService, String> {
}
