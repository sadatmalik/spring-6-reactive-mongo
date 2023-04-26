package com.creativefusion.spring6reactivemongo.mappers;

import com.creativefusion.spring6reactivemongo.domain.Beer;
import com.creativefusion.spring6reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

/**
 * @author sm@creativefusion.net
 */
@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
