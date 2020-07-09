package com.miron.ru.service;

import com.miron.ru.dto.UsersDto;
import com.miron.ru.exception.ValidationException;

import java.util.List;


public interface UsersService {

    UsersDto saveUser(UsersDto usersDto) throws ValidationException;

    void deleteUser(Integer userId);

    UsersDto findByLogin(String login);

    List<UsersDto> findAll();
}