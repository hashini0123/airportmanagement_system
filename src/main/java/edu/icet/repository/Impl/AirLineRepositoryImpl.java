package edu.icet.repository.Impl;

import edu.icet.model.dto.AirLineDTO;
import edu.icet.repository.AirLineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AirLineRepositoryImpl implements AirLineRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public boolean addAirLine(AirLineDTO airLineDTO) {
        String sql = "INSERT INTO airline (?,?,?,?)";
        return jdbcTemplate.update(sql,
                airLineDTO.getAirlineId(),
                airLineDTO.getAirlineName(),
                airLineDTO.getCountry(),
                airLineDTO.getRating()
                )>0;
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
