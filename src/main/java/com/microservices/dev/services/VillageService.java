package com.microservices.dev.services;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microservices.dev.modal.consumption;
import com.microservices.dev.modal.villagedao;
import com.microservices.dev.repository.ConsumptionRepository;
import com.microservices.dev.repository.VillageRepository;

//import com.microservices.dev.repository.VillageRepository;

@Component
public class VillageService {
	
	@Autowired
	private VillageRepository villageRepository;
	@Autowired
	private ConsumptionRepository consumptionRepository;

	public String counter_calback(int village_id,Double amount) {
		consumption co=new consumption();
		co.setVillage_id(village_id);
		co.setAmount(amount);
		co.setDate(new Date());
		consumptionRepository.save(co);
		return "Added successfully";
	}
	
	public Optional<villagedao> getOneById(int id) {
		return villageRepository.findById(id);
	}
	 
	public String add(String name) {
		villagedao vil=new villagedao();
		vil.setName(name);
		villageRepository.save(vil);
		return "Village added";
	}

}
