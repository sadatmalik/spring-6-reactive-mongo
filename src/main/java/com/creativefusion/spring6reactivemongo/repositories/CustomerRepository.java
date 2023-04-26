package com.creativefusion.spring6reactivemongo.repositories;

import com.creativefusion.spring6reactivemongo.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author sm@creativefusion.net
 */
public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
