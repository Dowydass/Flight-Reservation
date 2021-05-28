package com.flight.flightReservation.Controller;

import com.flight.flightReservation.Model.Reservation;
import com.flight.flightReservation.Repository.ReservationRepository;
import com.flight.flightReservation.dto.ReservationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationRestController {


        @Autowired
        ReservationRepository reservationRepository;

        @RequestMapping("/reservations/{id}")
                public Reservation findReservation(@PathVariable("id") Long id){
                   return reservationRepository.findById(id).orElse(null);
        }
    }
}
