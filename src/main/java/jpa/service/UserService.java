package jpa.service;

import jpa.model.User;

import java.util.List;

public interface UserService {
    List<User> findUser();
}
