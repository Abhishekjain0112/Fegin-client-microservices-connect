package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Status;
import com.example.demo.service.FeginService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private FeginService feginService;
	
	@GetMapping("/get/{name}")
	public Status getStatusFromWeb(@PathVariable String name) {
		Status status = feginService.getMessage(name);
		return new Status("Fegin Client :: "+status.getMsg());
	}
	
	@GetMapping("/getme/{name}")
	public Status getme(@PathVariable String name) {
		
		return new Status("Fegin Client :: "+name);
	}	
	
}
