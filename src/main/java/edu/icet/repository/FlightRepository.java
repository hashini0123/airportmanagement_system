package edu.icet.repository;

import edu.icet.model.dto.FlightDTO;

public interface FlightRepository {
    boolean addFlight(FlightDTO flightDTO);
}
