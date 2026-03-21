package com.construction.backend.controller;

import com.construction.backend.model.ContactMessage;
import com.construction.backend.service.ContactMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
public class ContactController {

    private final ContactMessageService contactMessageService;

    @PostMapping("/contact")
    public ResponseEntity<ContactMessage> createContactMessage(@RequestBody ContactMessage contactMessage) {
        return ResponseEntity.ok(contactMessageService.createContactMessage(contactMessage));
    }

    @GetMapping("/contact")
    public ResponseEntity<List<ContactMessage>> getAllContactMessages() {
        return ResponseEntity.ok(contactMessageService.getAllContactMessages());
    }
}
