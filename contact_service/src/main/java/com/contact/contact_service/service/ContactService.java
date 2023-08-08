package com.contact.contact_service.service;

import com.contact.contact_service.entities.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> getContactOfUser(Long userId);
}
