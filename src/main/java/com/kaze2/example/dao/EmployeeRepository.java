package com.kaze2.example.dao;

import com.kaze2.example.model.Employee;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
    @Query("{ 'name': ?0 }")
    Flux<Employee> findByName(final String name);
}
