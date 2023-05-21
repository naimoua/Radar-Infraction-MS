package org.immatriculation.web;


import org.immatriculation.dao.entities.Vehicle;
import org.immatriculation.dao.entities.Owner;
import org.immatriculation.dao.repositories.OwnerRepository;
import org.immatriculation.dao.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
//@RequestMapping("/api")
public class ImmatricRestController {
    @Autowired
    private OwnerRepository ownerRepository;
    @Autowired
    private VehicleRepository vehicleRepository;
    @GetMapping("owners")
    public List<Owner> ownerList(){
        return ownerRepository.findAll();
    }
    @GetMapping("/owners/{id}")
    public Owner ownerById(@PathVariable Long id){
        Owner owner = ownerRepository.findById(id).get();
        return owner;
    }
    @PostMapping("/owners")
    public Owner saveOwner(@RequestBody Owner owner){
        return ownerRepository.save(owner);
    }
    @PutMapping("/owners/{id}")
    public Owner updateOwner(@RequestBody Owner owner, @PathVariable Long id){
        return ownerRepository.save(owner);
    }
    @DeleteMapping("/owners/{id}")
    public void deleteOwner(@PathVariable Long id){
        ownerRepository.deleteById(id);
    }
    //vehicles
    @GetMapping("vehicles")
    public List<Vehicle> vehicleList(){
        return vehicleRepository.findAll();
    }
    @GetMapping("/vehicles/{id}")
    public Vehicle vehicleById(@PathVariable String id){
        Vehicle vehicle = vehicleRepository.findById(id).get();
        return vehicle;
    }
    @PostMapping("/vehicles")
    public Vehicle saveVehicle(@RequestBody Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }
    @PutMapping("/vehicles/{id}")
    public Vehicle updateVehicle(@RequestBody Vehicle vehicle, @PathVariable String id){
        return vehicleRepository.save(vehicle);
    }
    @DeleteMapping("/vehicles/{id}")
    public void deleteVehicle(@PathVariable String id){
        vehicleRepository.deleteById(id);
    }
}
