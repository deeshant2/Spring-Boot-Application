package com.springboot.deeshant.airline.repositories;

import com.springboot.deeshant.airline.data.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
