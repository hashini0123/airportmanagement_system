package edu.icet.repository.Impl;

import edu.icet.model.dto.AirLineDTO;
import edu.icet.repository.AirLineRepository;

import java.util.List;

public class AirLineRepositoryImpl implements AirLineRepository {
    @Override
    public boolean addAirLine(AirLineDTO airLineDTO) {
        return false;
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
