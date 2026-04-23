package edu.icet.service.Impl;

import edu.icet.model.dto.FlightDTO;
import edu.icet.repository.FlightRepository;
import edu.icet.service.FlightService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;

    @Override
    public boolean addFlight(FlightDTO flightDTO) {
        return flightRepository.addFlight(flightDTO);
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
