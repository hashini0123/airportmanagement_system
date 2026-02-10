package edu.icet.repository;

import edu.icet.model.entity.AirLineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirLineRepository extends JpaRepository<AirLineEntity,Integer> {
}
