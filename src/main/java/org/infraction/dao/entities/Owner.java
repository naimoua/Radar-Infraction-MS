package org.infraction.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.infraction.dao.entities.Vehicle;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @DateTimeFormat(pattern = "YYYY-MM-dd")
    private String birthDate;
    private String email;
    @OneToMany
    private Collection<Vehicle> vehicles;

    public Owner(String name, String birthDate, String email, Collection<Vehicle> vehicles) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.vehicles = vehicles;
    }
}