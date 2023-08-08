package com.user.user_service.service;

import com.user.user_service.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    List<User> users = List.of(
            new User(123L,"Suraj", "1234567890"),
            new User(124L, "Shyam", "0123456879"),
            new User(125L, "Tannu", "9874563210")
    );
    @Override
    public User getUser(Long id) {
        return this.users.stream().filter(user -> user.getId().equals(id)).findAny().orElse(null);
    }
}
