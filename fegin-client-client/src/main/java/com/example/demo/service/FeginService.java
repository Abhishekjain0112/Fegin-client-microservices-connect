package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.client.FeginClient;
import com.example.demo.dto.Status;

@Service
public class FeginService {

	@Autowired
	private FeginClient feginClient;
	
	public Status getMessage(String name) {
		return feginClient.getStatus(name);
		
	}
	
	
}
