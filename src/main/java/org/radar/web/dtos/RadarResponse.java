package org.radar.web.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RadarResponse {
    private Long id;
    private int max_velocity;
    private Float longitude;
    private Float latitude;
}
