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
        String sql = "UPDATE airline SET airLineName = ?, country = ?, rating = ? WHERE airLineId= ?";
        return jdbcTemplate.update(sql,
                airLineDTO.getAirlineId(),
                airLineDTO.getAirlineName(),
                airLineDTO.getCountry(),
                airLineDTO.getRating()
                )>0;
    }

    @Override
    public boolean deleteById(String id) {
        String sql = "DELETE FROM airline WHERE airLineId=?";
        return jdbcTemplate.update(sql,id)>0;
    }

    @Override
    public List<AirLineDTO> getAll() {
        String sql = "SELECT * FROM airline";
        List<AirLineDTO> airLineDTOList = jdbcTemplate.query(sql, (rs, rowNum) -> {
            AirLineDTO airLineDTO = new AirLineDTO();
            airLineDTO.setAirlineId(Integer.valueOf(rs.getString(1)));
            airLineDTO.setAirlineName(rs.getString(2));
            airLineDTO.setCountry(rs.getString(3));
            airLineDTO.setRating(Double.parseDouble(rs.getString(4)));
            return airLineDTO;
        });
        return airLineDTOList;
    }
}
