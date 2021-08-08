package de.ticketingbackend.outbound.repositories;

import de.ticketingbackend.outbound.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Long> {
}
