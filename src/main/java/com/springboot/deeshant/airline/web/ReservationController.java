package com.springboot.deeshant.airline.web;

import com.springboot.deeshant.airline.business.ReservationService;
import com.springboot.deeshant.airline.utils.DateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping("/reservations")
public class ReservationController {
    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/all")
    public String getAllReservations(Model model) {
        model.addAttribute("reservations", this.reservationService.getAllReservations());
        return "resall";
    }

    @GetMapping("/date")
    public String getReservationsByDate(@RequestParam(value = "date", required = false)String dateString, Model model) {
        DateUtils dateUtils = new DateUtils();
        Date date = dateUtils.getDateFromString(dateString);

        model.addAttribute("reservations", this.reservationService.getReservationsByDate(date));
        return "resdate";
    }

}
