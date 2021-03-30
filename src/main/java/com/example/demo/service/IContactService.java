package com.example.demo.service;

import com.example.demo.model.Contact;

import java.util.List;
import java.util.Optional;

public interface IContactService {
    List<Contact> findAll();
    Optional<Contact> findById(Long id);
}
