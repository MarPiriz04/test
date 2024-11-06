package com.proyectoFinalJavaPiriz.test.mapper;

import com.proyectoFinalJavaPiriz.test.model.User;

import com.proyectoFinalJavaPiriz.test.dto.UserDTO;

public class UserMapperBuilder {

    public static UserDTO buildDTO(User user) {
        return UserMapper.toDTO(user);
    }

    public static User buildEntity(UserDTO dto) {
        return UserMapper.toEntity(dto);
    }
}
