package edu.icet.service;

import edu.icet.model.dto.AirLineDTO;

import java.util.List;

public interface AirLineService {

    boolean addAirLine(AirLineDTO airLineDTO);

    boolean updateAirLine(AirLineDTO airLineDTO);

    boolean deleteById(String id);

    List<AirLineDTO> getAll();
}
