package edu.icet.service.Impl;

import edu.icet.model.dto.FlightDTO;
import edu.icet.service.FlightService;

import java.util.List;

public class FlightServiceImpl implements FlightService {
    @Override
    public boolean addFlight(FlightDTO flightDTO) {
        return false;
    }

    @Override
    public boolean updateFligh(FlightDTO flightDTO) {
        return false;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public List<FlightDTO> getAll() {
        return List.of();
    }
}
