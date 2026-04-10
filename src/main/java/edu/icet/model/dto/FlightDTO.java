package edu.icet.model.dto;

import java.time.LocalDateTime;

public class FlightDTO {
    private Integer flightId;
    private Integer airLineId;
    private String flightName;
    private String origin;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String status;
}
