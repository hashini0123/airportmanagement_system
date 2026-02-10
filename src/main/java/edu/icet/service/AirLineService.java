package edu.icet.service;

import edu.icet.model.dto.AirLineDTO;

import java.util.List;

public interface AirLineService {

    void addAirLine(AirLineDTO airline);
    void updateAriLine(AirLineDTO airLine);
    void deleteAirLine(Integer id);
    AirLineDTO searchId(Integer id);
    List<AirLineDTO> getAll();

}
