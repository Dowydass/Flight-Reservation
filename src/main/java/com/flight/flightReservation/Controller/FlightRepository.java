package com.flight.flightReservation.Controller;

import com.flight.flightReservation.Model.Flight;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
