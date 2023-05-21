package org.radar.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor @ToString @Builder
public class Vehicle {
    private String licensePlateNumber;
    private String brand;
    private String fiscalHorsepower;
    private String model;
    private Owner owner;


}
