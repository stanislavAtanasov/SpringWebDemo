package com.example.spring.web.demo.repository.implementations;
import com.example.spring.web.demo.entity.User;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;


public interface SpringDataJPA extends CrudRepository<User, Integer> {

    Optional<User> findByUsername(String username);
    User save (User user);
}
