package org.radar.web;

import org.radar.dao.entities.Radar;
import org.radar.dao.repositories.RadarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RadarRestController {
    @Autowired
    private RadarRepository radarRepository;

    @GetMapping("radars")
    public List<Radar> radarList(){
        return radarRepository.findAll();
    }
    @GetMapping("/radars/{id}")
    public Radar radarById(@PathVariable String id){
        Radar radar = radarRepository.findById(id).get();
        return radar;
    }
    @PostMapping("/radars")
    public Radar saveRadar(@RequestBody Radar radar){
        return radarRepository.save(radar);
    }
    @PutMapping("/radars/{id}")
    public Radar updateRadar(@RequestBody Radar radar, @PathVariable String id){
        return radarRepository.save(radar);
    }
    @DeleteMapping("/radars/{id}")
    public void deleteRadar(@PathVariable String id){
        radarRepository.deleteById(id);
    }
    //vehicles
}
