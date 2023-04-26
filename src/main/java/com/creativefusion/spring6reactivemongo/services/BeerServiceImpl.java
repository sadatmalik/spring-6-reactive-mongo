package com.creativefusion.spring6reactivemongo.services;

import com.creativefusion.spring6reactivemongo.model.BeerDTO;
import reactor.core.publisher.Mono;

/**
 * @author sm@creativefusion.net
 */
public class BeerServiceImpl implements BeerService {
    @Override
    public Mono<BeerDTO> saveBeer(BeerDTO beerDto) {
        return null;
    }

    @Override
    public Mono<BeerDTO> getById(String beerId) {
        return null;
    }
}
