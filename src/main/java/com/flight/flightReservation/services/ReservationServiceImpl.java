package com.flight.flightReservation.services;

import com.flight.flightReservation.Model.Flight;
import com.flight.flightReservation.Model.Passenger;
import com.flight.flightReservation.Model.Reservation;
import com.flight.flightReservation.Repository.FlightRepository;
import com.flight.flightReservation.Repository.PassengerRepository;
import com.flight.flightReservation.Repository.ReservationRepository;
import com.flight.flightReservation.dto.ReservationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    ReservationRepository reservationRepository;


        @Override
        public Reservation bookFlight(ReservationRequest request){
            Long flightId = request.getFlightId();
            Flight flight = flightRepository.findById(flightId).orElse(null);

            Passenger passenger = new Passenger();
            passenger.setFirstName(request.getPassengerFirstName());
            passenger.setLastName(request.getPassengerLastName());
            passenger.setPhone(request.getPassangerPhone());
            passenger.setEmail(request.getPassengerEmail());
            Passenger savedPassenger = passengerRepository.save(passenger);

            Reservation reservation = new Reservation();
            reservation.setFlight(flight);
            reservation.setPassenger(savedPassenger);
            reservation.setCheckedIn(false);

            Reservation savedReservation = reservationRepository.save(reservation);

            return savedReservation;
        }
}
