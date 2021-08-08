package de.ticketingbackend.outbound.repositories;

import de.ticketingbackend.outbound.entities.PlaceEntity;
import org.springframework.data.repository.CrudRepository;

public interface PlaceRepository extends CrudRepository<PlaceEntity, Long> {
}
