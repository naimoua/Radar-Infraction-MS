package org.infraction.web.dtos;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.infraction.dao.entities.Radar;
import org.infraction.dao.entities.Vehicle;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InfractionRequest {
    private Long id;
    private String date;
    private Radar radar_id;
    private Radar radar_max_velocity;
    private Vehicle vehicle_license;
    private Vehicle vehicle_velocity;
    private double cost;
}
