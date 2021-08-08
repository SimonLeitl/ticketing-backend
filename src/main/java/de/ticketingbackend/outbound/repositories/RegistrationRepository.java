package de.ticketingbackend.outbound.repositories;

import de.ticketingbackend.outbound.entities.RegistrationEntity;
import org.springframework.data.repository.CrudRepository;

public interface RegistrationRepository extends CrudRepository<RegistrationEntity, Long> {
}
