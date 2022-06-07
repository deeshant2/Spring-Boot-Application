package com.springboot.deeshant.airline.repositories;

import com.springboot.deeshant.airline.data.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Long> {
}
