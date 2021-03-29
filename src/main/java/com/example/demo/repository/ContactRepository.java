package com.example.demo.repository;

import com.example.demo.model.Contact;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
    @Query("Select c from contacts as c where id = ?1")
    List<Contact> findById(int id);
}
