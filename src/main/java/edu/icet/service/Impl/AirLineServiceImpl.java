package edu.icet.service.Impl;

import edu.icet.model.dto.AirLineDTO;
import edu.icet.service.AirLineService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AirLineServiceImpl implements AirLineService {


    @Override
    public boolean addAirLine(AirLineDTO airLineDTO) {

        return false;
    }

    @Override
    public void updateAirLine(AirLineDTO airLineDTO) {

    }

    @Override
    public void deleteAirLine(Integer id) {

    }

    @Override
    public AirLineDTO serachById(Integer id) {
        return null;
    }

    @Override
    public List<AirLineDTO> getAll() {
        return List.of();
    }
}
