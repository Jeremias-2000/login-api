package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

public interface Requests {

    @GetMapping("/")
    String test();

    @GetMapping("/users")
    ResponseEntity<?> getAll();

    @GetMapping("/user/{id}")
    ResponseEntity<?> getUser(@PathVariable("id") String id);

    @GetMapping("/user/email/{email}")
    ResponseEntity<?> getEmail(@PathVariable("email") String email);

    @PostMapping("/Sign up")
    void save(@Validated @RequestBody User user);

    @PutMapping("update/{id}")
    ResponseEntity<?> updateUser(@PathVariable("id") String id,@Validated @RequestBody User user);


    @DeleteMapping("delete user/{id}")
    ResponseEntity<?> deleteUser(@PathVariable("id") String id);
}
