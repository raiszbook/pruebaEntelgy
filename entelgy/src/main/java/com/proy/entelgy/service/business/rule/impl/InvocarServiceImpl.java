package com.proy.entelgy.service.business.rule.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.proy.entelgy.service.business.dto.PersonaDTOResponse;
import com.proy.entelgy.service.business.rule.InvocarService;

@Service
public class InvocarServiceImpl implements InvocarService {

	String url = "https://reqres.in/api/users";
	
	@Override
	public PersonaDTOResponse invocarUrl() {

		RestTemplate restTemplate = new RestTemplate();
		
		return restTemplate.getForObject(url, PersonaDTOResponse.class);
	}

}
