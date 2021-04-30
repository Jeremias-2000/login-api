package com.example.demo.Repositorytest;


import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataMongoTest

public class UserTestRepository {
   @Autowired
    private UserRepository repository;

   @Rule
   public ExpectedException thrown = ExpectedException.none();

   /* @Test
    public void createUserData(){
        User user = new User("t123","j.po@ok.com","test");
        this.repository.save(user);
        assertThat(user.getId()).isNotNull();
        assertThat(user.getEmail()).isEqualTo("j.po@outlook.com");
        assertThat(user.getPassword()).isEqualTo("test");
    }

    @Test
    public void deleteUserData(){
        User user = new User("t123","j.po@outlook.com","test");
        this.repository.save(user);
        repository.delete(user);
        assertThat(repository.findById(user.getId())).isEmpty();
    }

    @Test
    public void updateUserData(){
        User user = new User("t123","j.po@outlook.com","test");
        this.repository.save(user);
        user.setEmail("j2020.po@outlook.com");
        user.setPassword("test123");
        this.repository.save(user);
        assertThat(user.getEmail()).isEqualTo("j2020.pinheiro@outlook.com");
        assertThat(user.getPassword()).isEqualTo("test123");
    }
*/

}
