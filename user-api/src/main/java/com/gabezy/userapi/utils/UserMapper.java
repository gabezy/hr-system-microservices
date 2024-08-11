package com.gabezy.userapi.utils;

import com.gabezy.userapi.domain.entities.User;
import com.gabezy.userapi.domain.entities.dtos.UserDTO;

public class UserMapper {

    public static UserDTO toDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getUsername(),
                user.getUsername(),
                user.getHourlyPrice()
        );
    }

}
