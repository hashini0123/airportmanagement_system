package edu.icet.repository;

import edu.icet.model.dto.AirLineDTO;
import edu.icet.model.entity.AirLineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirLineRepository {


    boolean addAirLine(AirLineDTO airLineDTO);
}
