package edu.icet.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AirLineEntity {

    private Integer airlineId;

    private String airlineName;

    private String country;

    private double rating;

}
