package com.example.demo.model;

import javax.persistence.*;


@Entity
@Table(name="contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
    private String full_name;
    @Enumerated(EnumType.STRING)
    private Type type;
    private String phone_number;
    private String address;

    public Contact() {
        this.email = "";
        this.full_name = "";
        this.type = Type.Staff;
        this.phone_number = "";
        this.address = "";
    }

    public Contact(String email, String full_name, Type type, String phone_number, String address ) {
        this.email = email;
        this.full_name = full_name;
        this.type = type;
        this.phone_number = phone_number;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
