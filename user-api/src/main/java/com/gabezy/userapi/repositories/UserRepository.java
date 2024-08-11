package com.gabezy.userapi.repositories;

import com.gabezy.userapi.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
