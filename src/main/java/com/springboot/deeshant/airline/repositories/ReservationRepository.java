package com.springboot.deeshant.airline.repositories;

import com.springboot.deeshant.airline.data.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
