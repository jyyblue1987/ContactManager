package com.example.demo.service;

import com.example.demo.model.Contact;

import java.util.List;

public interface IContactService {
    List<Contact> findById(int id);
}
