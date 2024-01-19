package com.rbac.services;

import java.util.ArrayList;
import java.util.List;

import com.rbac.models.User;

public class UserService {
    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("abc", "abc", "abc@gmail.com"));
        list.add(new User("abc", "abc", "abc@gmail.com"));
    }

    // get all user
    public List<User> getallUsers() {
        return this.list;
    }

    // get user by usernamee
    public User getUser(String username) {
        return this.list.stream().filter(user -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    // add user
    public User addUser(User user) {
        this.list.add(user);
        return user;
    }
}
