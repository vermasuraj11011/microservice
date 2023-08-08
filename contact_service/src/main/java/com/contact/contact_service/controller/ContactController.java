package com.contact.contact_service.controller;

import com.contact.contact_service.entities.Contact;
import com.contact.contact_service.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("user/{userId}")
    public ResponseEntity<List<Contact>> getContactByUserId(@PathVariable Long userId){
        List<Contact> contacts = this.contactService.getContactOfUser(userId);
        return ResponseEntity.ok(contacts);
    }
}
