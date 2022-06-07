package com.springboot.deeshant.airline.web;

import com.springboot.deeshant.airline.business.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/planes")
public class PlaneController {
    private final ReservationService reservationService;

    public PlaneController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getPlanes(Model model) {
        model.addAttribute("planes", this.reservationService.getAllPlanes());
        return "pl";
    }
}
