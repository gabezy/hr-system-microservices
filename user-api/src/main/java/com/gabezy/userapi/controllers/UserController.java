package com.gabezy.userapi.controllers;

import com.gabezy.userapi.domain.entities.User;
import com.gabezy.userapi.domain.entities.dtos.UserDTO;
import com.gabezy.userapi.service.UserService;
import com.gabezy.userapi.utils.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        return ResponseEntity.ok(userService.findAll().stream().map(UserMapper::toDTO).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(UserMapper.toDTO(userService.findById(id)));
    }

}
