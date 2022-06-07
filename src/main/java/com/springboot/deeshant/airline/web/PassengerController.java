package com.springboot.deeshant.airline.web;

import com.springboot.deeshant.airline.business.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/passengers")
public class PassengerController {
    private final ReservationService reservationService;

    public PassengerController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getPassengers(Model model) {
        model.addAttribute("passengers", this.reservationService.getAllPassengers());
        return "pass";
    }
}
