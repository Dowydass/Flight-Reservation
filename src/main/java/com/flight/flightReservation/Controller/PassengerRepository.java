package com.flight.flightReservation.Controller;

import com.flight.flightReservation.Model.Passenger;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
