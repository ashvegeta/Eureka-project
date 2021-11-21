package com.example.service1.repository;
import com.example.service1.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends CrudRepository<User, Integer> 
{
    User findById(int id);
}