package com.creativefusion.spring6reactivemongo.mappers;

import com.creativefusion.spring6reactivemongo.domain.Customer;
import com.creativefusion.spring6reactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;

/**
 * @author sm@creativefusion.net
 */
@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
