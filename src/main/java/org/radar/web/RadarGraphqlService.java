package org.radar.web;

import lombok.AllArgsConstructor;
import org.radar.dao.entities.Radar;
import org.radar.dao.repositories.RadarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
@AllArgsConstructor
public class RadarGraphqlService {
    @Autowired
    private RadarRepository radarRepository;

    @QueryMapping
    public List<Radar> radars(){
        return radarRepository.findAll();
    }
    @QueryMapping
    public Radar radarById(@Argument String id){
        return radarRepository.findById(id).get();
    }
    @MutationMapping
    public Radar saveRadar(@Argument Radar radar){
        return radarRepository.save(radar);
    }
    @MutationMapping
    public Radar updateRadar(@Argument Radar radar){
        return radarRepository.save(radar);
    }
    @MutationMapping
    public void deleteRadar(@Argument  String id){
        radarRepository.deleteById(id);
    }
}
