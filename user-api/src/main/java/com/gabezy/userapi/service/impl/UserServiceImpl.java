package com.gabezy.userapi.service.impl;

import com.gabezy.userapi.domain.entities.User;
import com.gabezy.userapi.exceptions.ResourceNotFoundException;
import com.gabezy.userapi.repositories.UserRepository;
import com.gabezy.userapi.service.UserService;
import com.gabezy.userapi.utils.RequestCounter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.mapper.Mapper;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final Environment env;
    private Mapper mapper;

    @Override
    public User findById(Long id) {
        log.info("USER_SERVICE ::: GET Request on PORT {} - REQUEST COUNTER [{}]",
                env.getProperty("local.server.port"), RequestCounter.increment());
        return userRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
