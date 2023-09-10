package com.joaofdev.springboot.registrationlogindemo.service;

import com.joaofdev.springboot.registrationlogindemo.dto.UserDto;
import com.joaofdev.springboot.registrationlogindemo.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
