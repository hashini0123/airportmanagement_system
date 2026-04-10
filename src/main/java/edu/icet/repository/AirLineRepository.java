package edu.icet.repository;

import edu.icet.model.dto.AirLineDTO;
import edu.icet.model.entity.AirLineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AirLineRepository {


    boolean addAirLine(AirLineDTO airLineDTO);

    boolean updateAirLine(AirLineDTO airLineDTO);

    boolean deleteById(String id);

    List<AirLineDTO> getAll();
}
