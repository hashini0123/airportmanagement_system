package edu.icet.repository;

import edu.icet.model.dto.FlightDTO;

import java.util.List;

public interface FlightRepository {

    boolean addFlight(FlightDTO flightDTO);


    boolean updateFlight(FlightDTO flightDTO);
}
