package com.example.service1.repository;

import com.example.service1.model.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface bookingRepository extends CrudRepository<Booking, Integer> 
{
    List<Booking> findAllByUserId(int userId);
}