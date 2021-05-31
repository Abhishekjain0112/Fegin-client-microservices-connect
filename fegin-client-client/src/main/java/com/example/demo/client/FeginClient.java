package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.Status;

@FeignClient(url = "http://localhost:8002/controller", name = "fegin-web")
public interface FeginClient {
	
	
	@GetMapping("/getName/{name}")
	public Status getStatus(@PathVariable String name);
		
	
	

}
