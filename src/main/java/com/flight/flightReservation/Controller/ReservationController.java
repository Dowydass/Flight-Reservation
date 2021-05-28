package com.flight.flightReservation.Controller;

import com.flight.flightReservation.Model.Flight;
import com.flight.flightReservation.Model.Reservation;
import com.flight.flightReservation.Repository.FlightRepository;
import com.flight.flightReservation.dto.ReservationRequest;
import com.flight.flightReservation.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
public class ReservationController {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    ReservationService reservationService;


    @RequestMapping("/showCompleteReservation")
    public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap){
        Flight flight = flightRepository.findById(flightId).orElse(null);
        modelMap.addAttribute("flight",flight);
        return "completeReservation";
    }

    @RequestMapping(value = "/completeReservation", method = RequestMethod.POST)
    public String completeReservation(ReservationRequest request , ModelMap modelMap){
       Reservation reservation =  reservationService.bookFlight(request);
        modelMap.addAttribute("msg", "Reservation created successfully and the id is" + reservation.getId());
       return "reservationConfirmation";
    }
}
