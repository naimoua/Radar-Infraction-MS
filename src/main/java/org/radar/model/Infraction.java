package org.radar.model;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.radar.dao.entities.Radar;
@Data
@ToString
@Builder
@AllArgsConstructor
public class Infraction {
    private Long id;
    private String date;
    private String radar_id;
    private int radar_max_velocity;
    private String vehicle_license;
    private double vehicle_velocity;
    private double cost;
}
