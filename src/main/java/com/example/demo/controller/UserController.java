package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;


@RestController
public class UserController implements Requests{

    @Autowired
    private UserService service;


    @Override
    public String test() {
        return "<h2>Deu Certo</h2>";
    }

    @Override
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(service.listAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getUser(String id) {
        try {
            User user = service.getById(id);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<?> getEmail(String email) {
        try {
            User user = service.getById(email);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public void save(User user) {
        service.add(user);
    }

    @Override
    public ResponseEntity<?> updateUser(String id, User user) {
        try {
            User existsSnack = service.getById(id);
            service.update(id, user);

            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<?> deleteUser(String id) {
        try {
            service.deleteUserById(id);

            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
