package com.proy.entelgy.service.business.rule.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proy.entelgy.rest.jsons.CreatePersonaRest;
import com.proy.entelgy.service.business.dto.PersonaDTOResponse;
import com.proy.entelgy.service.business.rule.InvocarService;
import com.proy.entelgy.service.business.rule.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	
	
	
	@Autowired
	private InvocarService invocarService;
	


	@Override
	public String crearPersona(CreatePersonaRest createPersonaRest) {

		return reestructurar(createPersonaRest);
	}
	

	@Override
	public String reestructurar(CreatePersonaRest createPersonaRest) {

		PersonaDTOResponse response=invocarService.invocarUrl();
		
		return response.getId()+"|"+ createPersonaRest.getLast_name() +"|"+ createPersonaRest.getEmail();
	}
	
	

}
