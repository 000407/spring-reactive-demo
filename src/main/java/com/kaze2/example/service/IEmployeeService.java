package com.kaze2.example.service;

import com.kaze2.example.model.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IEmployeeService {
    void create(Employee e);

    Mono<Employee> findById(String id);

    Flux<Employee> findByName(String name);

    Flux<Employee> findAll();

    Mono<Employee> update(Employee e);

    Mono<Void> delete(String id);
}