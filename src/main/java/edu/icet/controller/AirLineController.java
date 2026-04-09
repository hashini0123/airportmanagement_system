package edu.icet.controller;

import edu.icet.model.dto.AirLineDTO;
import edu.icet.service.AirLineService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class AirLineController {

    private final AirLineService airLineService;

    @PostMapping("/add")
    public boolean addAirLine(@RequestBody AirLineDTO airLineDTO){
        return airLineService.addAirLine(airLineDTO);
    }

    @PutMapping("/update")
    public boolean updateAirLine(@RequestBody AirLineDTO airLineDTO){
        return airLineService.updateAirLine(airLineDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public boolean deleteAirLine(@PathVariable String id){
        return airLineService.deleteById(id);
    }
}
