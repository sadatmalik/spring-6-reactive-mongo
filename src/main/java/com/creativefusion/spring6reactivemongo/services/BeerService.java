package com.creativefusion.spring6reactivemongo.services;

import com.creativefusion.spring6reactivemongo.model.BeerDTO;
import reactor.core.publisher.Mono;

/**
 * @author sm@creativefusion.net
 */
public interface BeerService {
    Mono<BeerDTO> saveBeer(BeerDTO beerDto);

    Mono<BeerDTO> getById(String beerId);
}
