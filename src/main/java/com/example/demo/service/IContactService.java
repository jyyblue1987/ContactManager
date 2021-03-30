package com.example.demo.service;

import com.example.demo.model.Contact;

import java.util.Optional;

public interface IContactService {
    Optional<Contact> findById(Long id);
}
