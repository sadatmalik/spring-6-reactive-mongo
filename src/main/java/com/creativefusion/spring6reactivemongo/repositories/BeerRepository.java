package com.creativefusion.spring6reactivemongo.repositories;

import com.creativefusion.spring6reactivemongo.domain.Beer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author sm@creativefusion.net
 */
public interface BeerRepository extends ReactiveMongoRepository<Beer, String> {
}
