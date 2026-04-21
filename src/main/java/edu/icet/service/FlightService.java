package edu.icet.service;

import edu.icet.model.dto.FlightDTO;

public interface FlightService {
    boolean addFlight(FlightDTO flightDTO);

    boolean updateFligh(FlightDTO flightDTO);

    boolean deleteById(String id);
}
