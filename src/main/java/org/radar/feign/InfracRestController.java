package org.radar.feign;

import org.radar.model.Infraction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "infraction-service")
public interface InfracRestController {

    @GetMapping("/infractions/{id}")
    Infraction getInfractionByID(@PathVariable(name = "id") String id);

    @GetMapping("/api/infractions/radar/{id}")
    List<Infraction> getInfractionsByRadarID(@PathVariable("id") Long id);

    @PostMapping("/api/infractions")
    Infraction saveInfraction(@RequestBody Infraction infraction);
}