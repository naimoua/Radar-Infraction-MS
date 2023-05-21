package org.immatriculation.web;

import lombok.AllArgsConstructor;
import org.immatriculation.dao.entities.Vehicle;
import org.immatriculation.dao.entities.Owner;
import org.immatriculation.dao.repositories.OwnerRepository;
import org.immatriculation.dao.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ImmatricGraphql {
    @Autowired
    private OwnerRepository ownerRepository;
    @Autowired
    private VehicleRepository vehicleRepository;

    @QueryMapping
    public List<Owner> owners(){
        return ownerRepository.findAll();
    }
    @QueryMapping
    public Owner ownerById(@Argument Long id){
        return ownerRepository.findById(id).get();
    }
    @MutationMapping
    public Owner saveOwner(@Argument Owner owner){
        return ownerRepository.save(owner);
    }
    @MutationMapping
    public Owner updateOwner(@Argument Owner owner){
        return ownerRepository.save(owner);
    }
    @MutationMapping
    public void deleteOwner(@Argument  Long id){
        ownerRepository.deleteById(id);
    }

    //vehicles
    @QueryMapping
    public List<Vehicle> vehicles(){
        return vehicleRepository.findAll();
    }
    @QueryMapping
    public Vehicle vehicleById(@Argument String id){
        return vehicleRepository.findById(id).get();
    }
    @MutationMapping
    public Vehicle saveVehicle(@Argument Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }
    @MutationMapping
    public Vehicle updateVehicle(@Argument Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }
    @MutationMapping
    public void deleteVehicle(@Argument  String id){
        vehicleRepository.deleteById(id);
    }
}