package com.flight.flightReservation.Model;

import java.sql.Timestamp;

public class Flight {

    private Long id;
    private String flightNumber;
    private String operatingAirlines;
    private String departureCity;
    private String  arrivalCity;
    private String dateOfDeparture;
    private Timestamp estimatedDepartureTime;


    public Flight() {
    }

    public Flight(Long id, String flightNumber, String operatingAirlines, String departureCity, String arrivalCity, String dateOfDeparture, Timestamp estimatedDepartureTime) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.operatingAirlines = operatingAirlines;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.dateOfDeparture = dateOfDeparture;
        this.estimatedDepartureTime = estimatedDepartureTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOperatingAirlines() {
        return operatingAirlines;
    }

    public void setOperatingAirlines(String operatingAirlines) {
        this.operatingAirlines = operatingAirlines;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public Timestamp getEstimatedDepartureTime() {
        return estimatedDepartureTime;
    }

    public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
        this.estimatedDepartureTime = estimatedDepartureTime;
    }
}
