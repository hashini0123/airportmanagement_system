package edu.icet.service.Impl;

import edu.icet.model.dto.AirLineDTO;
import edu.icet.repository.AirLineRepository;
import edu.icet.service.AirLineService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AirLineServiceImpl implements AirLineService {

    private final AirLineRepository airLineRepository;

    @Override
    public boolean addAirLine(AirLineDTO airLineDTO) {
        return airLineRepository.addAirLine(airLineDTO);
    }

    @Override
    public boolean updateAirLine(AirLineDTO airLineDTO) {
        return false;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public List<AirLineDTO> getAll() {
        return List.of();
    }
}
