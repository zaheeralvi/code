package com.microservices.dev.repository;


import org.springframework.data.repository.CrudRepository;

import com.microservices.dev.modal.consumption;

public interface ConsumptionRepository extends CrudRepository<consumption, Integer>{

}
