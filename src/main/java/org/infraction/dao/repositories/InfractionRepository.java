package org.infraction.dao.repositories;

import org.infraction.dao.entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfractionRepository extends JpaRepository<Infraction, Long> {
}
