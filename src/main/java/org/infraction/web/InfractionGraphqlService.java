package org.infraction.web;

import lombok.AllArgsConstructor;
import org.infraction.dao.entities.Infraction;
import org.infraction.dao.repositories.InfractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class InfractionGraphqlService {
    @Autowired
    private InfractionRepository infractionRepository;

    @QueryMapping
    public List<Infraction> infractions(){
        return infractionRepository.findAll();
    }
    @QueryMapping
    public Infraction infractionById(@Argument Long id){
        return infractionRepository.findById(id).get();
    }
    @MutationMapping
    public Infraction saveInfraction(@Argument Infraction infraction){
        return infractionRepository.save(infraction);
    }
    @MutationMapping
    public Infraction updateInfraction(@Argument Infraction infraction){
        return infractionRepository.save(infraction);
    }
    @MutationMapping
    public void deleteInfraction(@Argument  Long id){
        infractionRepository.deleteById(id);
    }

}
