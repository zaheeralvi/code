package com.microservices.dev.api;

import java.util.Optional;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.dev.modal.villagedao;
import com.microservices.dev.services.VillageService;

@RestController
public class village {

	@Autowired
	private VillageService villageService;
	
	@ResponseBody
	@PostMapping("/counter_callback")
	public String home(@RequestBody int village_id, double amount) {
		return villageService.counter_calback(village_id, amount);
	}
	
	@ResponseBody
	@GetMapping("/counter")
	public Optional<villagedao> getCounter(@RequestParam int id) {
		return villageService.getOneById(id);
	}	
	
	@PostMapping("/counter")
	public String add(@RequestParam String name) {
		return villageService.add(name);
	}	

}
