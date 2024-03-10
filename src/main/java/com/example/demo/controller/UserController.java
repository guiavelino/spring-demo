package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String index() {
        return "User";
    }

    @PostMapping
    public void create(@RequestBody UserDTO userDto) {
        System.out.println(userDto.email());
    }

}
