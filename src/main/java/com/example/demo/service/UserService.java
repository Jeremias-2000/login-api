package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    //returns all
    public List<User> listAll(){
        return repository.findAll();
    }
   //return user
    public User getById(Long id){
        return repository.findById(id).orElse(null);
    }

    public User findByEmail(String email){
        return repository.findByEmail(email);
    }

    public void add(User user){
        repository.save(user);
    }

    public void update(Long id, User update){
        User exist = repository.findById(id).orElse(update);
        exist.setEmail(update.getEmail());
        exist.setPassword(exist.getPassword());

        repository.save(exist);
    }

    public void deleteUserById(Long id){
        User exists = repository.findById(id).orElse(null);
        repository.delete(exists);
    }


}
