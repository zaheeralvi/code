package com.microservices.dev.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservices.dev.modal.villagedao;

public interface VillageRepository extends CrudRepository<villagedao ,Integer> {

}
