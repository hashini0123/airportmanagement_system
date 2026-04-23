package edu.icet.service;

import edu.icet.model.dto.FlightDTO;

import java.util.List;

public interface FlightService {
    boolean addFlight(FlightDTO flightDTO);

    boolean updateFligh(FlightDTO flightDTO);

    boolean deleteById(String id);

    List<FlightDTO> getAll();
}
