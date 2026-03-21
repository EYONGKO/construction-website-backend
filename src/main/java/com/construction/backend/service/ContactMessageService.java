package com.construction.backend.service;

import com.construction.backend.model.ContactMessage;
import com.construction.backend.repository.ContactMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactMessageService {

    private final ContactMessageRepository contactMessageRepository;

    public ContactMessage createContactMessage(ContactMessage contactMessage) {
        if (contactMessage.getCreatedAt() == null) {
            contactMessage.setCreatedAt(LocalDateTime.now());
        }

        return contactMessageRepository.save(contactMessage);
    }

    public List<ContactMessage> getAllContactMessages() {
        return contactMessageRepository.findAll();
    }
}
