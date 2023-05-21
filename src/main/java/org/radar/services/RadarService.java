package org.radar.services;

import org.radar.dao.entities.Radar;

public interface RadarService {

    public boolean speeding(Radar radar, Integer velocity);
    public void vehicleOwner();
}
