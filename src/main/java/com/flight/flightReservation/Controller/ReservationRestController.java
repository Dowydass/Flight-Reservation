package com.flight.flightReservation.Controller;

import com.flight.flightReservation.dto.ReservationUpdateRequest;
import com.flight.flightReservation.Model.Reservation;
import com.flight.flightReservation.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
            //Update one reservation in reservation collection
    @RequestMapping("/reservations")
        public Reservation updateReservation(@RequestBody ReservationUpdateRequest request){
                Reservation reservation = reservationRepository.findById(request.getId()).orElse(null);
        reservation.setNumberOfBags(request.getNumberOfBags());
        reservation.setCheckedIn(request.getCheckedIn());
        return reservationRepository.save(reservation);//Update database with new list

        }
    }

