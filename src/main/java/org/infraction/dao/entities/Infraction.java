package org.infraction.dao.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Infraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long infrac_id;
    private String date;
    private String radar_id;
    private int radar_max_velocity;
    private String vehicle_license;
    private double vehicle_velocity;
    private double cost;
}
