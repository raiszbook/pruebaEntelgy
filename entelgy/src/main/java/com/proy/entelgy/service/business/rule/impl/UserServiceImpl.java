package com.proy.entelgy.service.business.rule.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.proy.entelgy.service.business.dto.UserResponse;
import com.proy.entelgy.service.business.rule.UserService;

@Service
@PropertySource("classpath:config/entelgy.properties")
public class UserServiceImpl implements UserService{
	
	@Value("${url}")
	private String url;

	@Override
	public UserResponse invocarServicio() {
		RestTemplate restTemplate=new RestTemplate();
		return restTemplate.getForObject(url, UserResponse.class);
	}

	@Override
	public Object generarData() {

		UserResponse response=invocarServicio();
		
		return response.getId()+"/"+response.getLast_name()+"/"+response.getEmail();
		
	
	}
	
	
	
	

}
