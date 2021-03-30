package com.example.demo.service;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContactService implements IContactService {
    @Autowired
    private ContactRepository repository;

    @Override
    public Optional<Contact> findById(Long id) {
        var contacts = (Optional<Contact>) repository.findById(id);
        return contacts;
    }
}
