package com.proy.entelgy.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proy.entelgy.rest.dto.UserDTOResponse;
import com.proy.entelgy.service.business.rule.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	
	
	@PostMapping(value = "/datarai", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, 
			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public UserDTOResponse generarData() {	
		
		Object datos=userService.generarData();
		
		Map<String,Object> lista=new HashMap<String, Object>();

		for(Entry<String,Object> e: lista.entrySet() ) {
			
			System.out.println(e+""+datos);
			
		}
		
	
		return new UserDTOResponse(datos);		
		
	}
	
	
	

}
