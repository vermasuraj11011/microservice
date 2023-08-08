package com.user.user_service.service;

import com.user.user_service.entities.User;
import org.springframework.stereotype.Service;


public interface UserService {

    public User getUser(Long id);

}
