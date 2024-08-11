package com.gabezy.userapi.service;

import com.gabezy.userapi.domain.entities.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();

}
