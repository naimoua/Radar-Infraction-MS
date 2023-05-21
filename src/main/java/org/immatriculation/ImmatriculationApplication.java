package org.immatriculation;

import org.immatriculation.dao.entities.Owner;
import org.immatriculation.dao.entities.Vehicle;
import org.immatriculation.dao.repositories.OwnerRepository;
import org.immatriculation.dao.repositories.VehicleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collection;
import java.util.Iterator;

@SpringBootApplication
public class ImmatriculationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmatriculationApplication.class, args);
    }

    @Bean
    CommandLineRunner start(OwnerRepository ownerRepository, VehicleRepository vehicleRepository){
        return(args -> {

            Collection<Vehicle> vehicles = new Collection<Vehicle>() {
                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean contains(Object o) {
                    return false;
                }

                @Override
                public Iterator<Vehicle> iterator() {
                    return null;
                }

                @Override
                public Object[] toArray() {
                    return new Object[0];
                }

                @Override
                public <T> T[] toArray(T[] a) {
                    return null;
                }

                @Override
                public boolean add(Vehicle vehicle) {
                    return false;
                }

                @Override
                public boolean remove(Object o) {
                    return false;
                }

                @Override
                public boolean containsAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean addAll(Collection<? extends Vehicle> c) {
                    return false;
                }

                @Override
                public boolean removeAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean retainAll(Collection<?> c) {
                    return false;
                }

                @Override
                public void clear() {

                }
            };
            Owner client = Owner.builder()
                    .name("houda")
                    .birthDate("2001-06-18")
                    .email("houda@gmail.com")
                    //.vehicles()
                    .build();
            ownerRepository.save(client);
            Vehicle vehicle = Vehicle.builder()
                    .licensePlateNumber("150154")
                    .brand("Ford")
                    .fiscalHorsepower("600h")
                    .model("45GR")
                    .owner(client)
                    .build();
            vehicleRepository.save(vehicle);
            vehicles.add(vehicle);
            client.setVehicles(vehicles);
        });

    }

}