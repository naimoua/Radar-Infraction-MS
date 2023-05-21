package org.immatriculation.web.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.immatriculation.dao.entities.Owner;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehicleRequest {
    private String licensePlateNumber;
    private String brand;
    private String fiscalHorsepower;
    private String model;
    private Owner owner;
}
