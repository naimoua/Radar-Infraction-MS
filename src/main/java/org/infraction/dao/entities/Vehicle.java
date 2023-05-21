package org.infraction.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Vehicle {
    @Id
    private String licensePlateNumber;
    private String brand;
    private String fiscalHorsepower;
    private String model;
    @ManyToOne
    private Owner owner;

}