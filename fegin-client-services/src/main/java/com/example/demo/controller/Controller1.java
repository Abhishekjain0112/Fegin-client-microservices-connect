package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Status;

@RestController
@RequestMapping("/controller")

public class Controller1 {

	
	@GetMapping("/getName/{name}")
	public Status getName(@PathVariable String name) {
                
		return new Status("Hello welcome to fegin web client  "+name);
		
		 
	}
	
	
}
