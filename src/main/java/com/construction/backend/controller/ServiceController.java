package com.construction.backend.controller;

import com.construction.backend.model.ConstructionService;
import com.construction.backend.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
public class ServiceController {

    private final ServiceService serviceService;

    @GetMapping
    public ResponseEntity<List<ConstructionService>> getAllServices() {
        return ResponseEntity.ok(serviceService.getAllServices());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConstructionService> getServiceById(@PathVariable String id) {
        return serviceService.getServiceById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ConstructionService> createService(@RequestBody ConstructionService service) {
        return ResponseEntity.ok(serviceService.createService(service));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ConstructionService> updateService(@PathVariable String id, @RequestBody ConstructionService service) {
        try {
            return ResponseEntity.ok(serviceService.updateService(id, service));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteService(@PathVariable String id) {
        serviceService.deleteService(id);
        return ResponseEntity.noContent().build();
    }
}
