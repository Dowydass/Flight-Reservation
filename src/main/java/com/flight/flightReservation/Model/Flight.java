package com.flight.flightReservation.Model;


import javax.persistence.*;

import java.sql.Timestamp;


@Entity
@Table(name ="Flight")
public class Flight extends AbstractEntity{

    @Column(name = "Flight_Number")
    private String flightNumber;
    @Column(name = "Operating_Airlines")
    private String operatingAirlines;
    @Column(name = "Departure_City")
    private String departureCity;
    @Column(name = "Arrival_City")
    private String  arrivalCity;
    @Column(name = "Date_Of_Departure")
    private String dateOfDeparture;
    @Column(name = "Estimated_Departure_Time")
    private Timestamp estimatedDepartureTime;





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
