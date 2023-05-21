package org.radar.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collection;
@Data
@AllArgsConstructor
public class Owner {
    private Long id;
    private String name;
    private String birthDate;
    private String email;
    private Collection<Vehicle> vehicles;
}
