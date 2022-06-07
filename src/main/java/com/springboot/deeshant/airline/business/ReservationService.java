package com.springboot.deeshant.airline.business;

import com.springboot.deeshant.airline.data.Passenger;
import com.springboot.deeshant.airline.data.Plane;
import com.springboot.deeshant.airline.data.Reservation;
import com.springboot.deeshant.airline.repositories.PassengerRepository;
import com.springboot.deeshant.airline.repositories.PlaneRepository;
import com.springboot.deeshant.airline.repositories.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ReservationService {
    private final PassengerRepository passengerRepository;
    private final PlaneRepository planeRepository;
    private final ReservationRepository reservationRepository;

    public ReservationService(PassengerRepository passengerRepository, PlaneRepository planeRepository, ReservationRepository reservationRepository) {
        this.passengerRepository = passengerRepository;
        this.planeRepository = planeRepository;
        this.reservationRepository = reservationRepository;
    }

    public List<Passenger> getAllPassengers() {
        return this.passengerRepository.findAll();
    }

    public List<Plane> getAllPlanes() {
        return this.planeRepository.findAll();
    }

    public List<Reservation> getAllReservations() {
        return this.reservationRepository.findAll();
    }

    public List<Reservation> getReservationsByDate(Date date) {
        List<Reservation> reservations = new ArrayList<>();

        for (Reservation reservation: this.getAllReservations()) {
            if (reservation.getDate().equals(date))
                reservations.add(reservation);
        }

        return reservations;
    }
}
