package com.example.demo.service;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContactService implements IContactService {
    @Autowired
    private ContactRepository repository;

    @Override
    public List<Contact> findById(int id) {
        var contacts = (List<Contact>) repository.findById(id);
        return contacts;
    }
}
