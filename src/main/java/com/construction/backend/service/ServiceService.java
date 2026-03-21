package com.construction.backend.service;

import com.construction.backend.model.ConstructionService;
import com.construction.backend.repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceService {

    private final ServiceRepository serviceRepository;

    public List<ConstructionService> getAllServices() {
        return serviceRepository.findAll();
    }

    public Optional<ConstructionService> getServiceById(String id) {
        return serviceRepository.findById(id);
    }

    public ConstructionService createService(ConstructionService service) {
        return serviceRepository.save(service);
    }

    public void deleteService(String id) {
        serviceRepository.deleteById(id);
    }

    public ConstructionService updateService(String id, ConstructionService service) {
        ConstructionService existingService = serviceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Service not found with id: " + id));

        existingService.setTitle(service.getTitle());
        existingService.setDescription(service.getDescription());
        existingService.setIcon(service.getIcon());
        existingService.setImage(service.getImage());

        return serviceRepository.save(existingService);
    }
}
