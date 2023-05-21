package org.radar.feign;

import org.radar.model.Owner;
import org.radar.model.Vehicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "immatriculation-service")
public interface ImmatriculationRestController {
@GetMapping("/owners/{id}")
    Owner getOwner(@PathVariable("id") Long id);

@GetMapping("/vehicles/{id}")
    Vehicle getVehicle(@PathVariable("id") String id);
        }
