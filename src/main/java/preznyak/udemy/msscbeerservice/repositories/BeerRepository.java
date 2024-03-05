package preznyak.udemy.msscbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import preznyak.udemy.msscbeerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
