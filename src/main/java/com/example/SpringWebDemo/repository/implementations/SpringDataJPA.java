package com.example.SpringWebDemo.repository.implementations;
import com.example.SpringWebDemo.entity.User;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;


public interface SpringDataJPA extends CrudRepository<User, Integer> {

    Optional<User> findByUsername(String username);
    User save (User user);
}
