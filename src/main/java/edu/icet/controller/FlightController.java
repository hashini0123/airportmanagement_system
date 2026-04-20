package edu.icet.controller;

import edu.icet.model.dto.FlightDTO;
import edu.icet.service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class FlightController {
    private final FlightService flightService;

    @PostMapping("/add")
    public boolean addFlight (@RequestBody FlightDTO flightDTO){
        return flightService.addFlight(flightDTO);
    }

    @PutMapping("/update")
    public boolean updateFlight (@RequestBody FlightDTO flightDTO){
        return flightService.updateFligh(flightDTO);
    }
}
