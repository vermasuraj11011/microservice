package com.contact.contact_service.service;

import com.contact.contact_service.entities.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{
    List<Contact> contacts = List.of(
            new Contact(1L,"shyamContact1@gmail.com","Cotact1 Shyma",124L),
            new Contact(2L,"shyamContact2@gmail.com","Cotact2 Shyma",124L),
            new Contact(3L,"shyamContact3@gmail.com","Cotact3 Shyma",124L),
            new Contact(4L,"surajContact1@gmail.com","Cotact1 Suraj",123L),
            new Contact(5L,"surajContact2@gmail.com","Cotact2 Suraj",123L),
            new Contact(6L,"surajContact3@gmail.com","Cotact3 Suraj",123L),
            new Contact(7L,"surajContact4@gmail.com","Cotact4 Suraj",123L),
            new Contact(8L,"surajContact5@gmail.com","Cotact5 Suraj",123L),
            new Contact(9L,"tannuContact1@gmail.com","Cotact1 tannu",125L)
    );

    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return this.contacts.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
