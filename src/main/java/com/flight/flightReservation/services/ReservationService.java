package com.flight.flightReservation.services;


import com.flight.flightReservation.Model.Reservation;
import com.flight.flightReservation.dto.ReservationRequest;

public interface ReservationService {

    public Reservation bookFlight(ReservationRequest request);


}
