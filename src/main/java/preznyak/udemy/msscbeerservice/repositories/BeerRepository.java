package preznyak.udemy.msscbeerservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import preznyak.udemy.msscbeerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
