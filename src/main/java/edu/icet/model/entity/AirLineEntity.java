package edu.icet.model.entity;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AirLineEntity {

    private String airline_id;

    private String airline_name;

    private String country;

    private String rating;

}
