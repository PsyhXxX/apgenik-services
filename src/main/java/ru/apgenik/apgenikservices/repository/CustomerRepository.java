package ru.apgenik.apgenikservices.repository;

import org.springframework.data.repository.CrudRepository;
import ru.apgenik.apgenikservices.entity.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
