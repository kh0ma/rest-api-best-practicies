package com.github.kh0ma.blog.api.controllers;

import java.util.List;

import com.github.kh0ma.blog.api.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class UsersControllerImpl implements UsersApi {
    @Override
    public ResponseEntity<List<User>> getUsers(Long id, String name, String sort, Integer pageNum, Integer pageSize) {
        List<User> resultList = List.of(
                new User()
                        .id(1l)
                        .name("okhome")
                        .firstName("Oleksandr")
                        .lastName("Khomenko")
                        .email("okhome@softserveinc.com")
        );
        return ResponseEntity.ok().header("X-Total-Count", String.valueOf(resultList.size())).body(resultList);
    }
}
