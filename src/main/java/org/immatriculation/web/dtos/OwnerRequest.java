package org.immatriculation.web.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.immatriculation.dao.entities.Vehicle;



import java.util.Collection;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OwnerRequest {
    private Long id;
    private String name;
    private Date birthDate;
    private String email;
    private Collection<Vehicle> vehicles;

}
