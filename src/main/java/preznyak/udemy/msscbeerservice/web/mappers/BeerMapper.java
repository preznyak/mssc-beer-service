package preznyak.udemy.msscbeerservice.web.mappers;

import org.mapstruct.Mapper;
import preznyak.udemy.msscbeerservice.domain.Beer;
import preznyak.udemy.msscbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
