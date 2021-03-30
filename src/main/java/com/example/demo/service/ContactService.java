package com.example.demo.service;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContactService implements IContactService {
    @Autowired
    private ContactRepository repository;

    public List<Contact> findAll() {
        var it = repository.findAll();

        var list = new ArrayList<Contact>();
        it.forEach(e -> list.add(e));

        return list;
    }

    @Override
    public Optional<Contact> findById(Long id) {
        var contacts = (Optional<Contact>) repository.findById(id);
        return contacts;
    }
}
