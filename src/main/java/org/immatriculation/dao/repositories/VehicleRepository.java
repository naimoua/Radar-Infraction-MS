package org.immatriculation.dao.repositories;

import org.immatriculation.dao.entities.Vehicle ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VehicleRepository extends JpaRepository<Vehicle, String> {
}
