package com.proy.entelgy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proy.entelgy.rest.jsons.CreatePersonaRest;
import com.proy.entelgy.rest.response.PersonaResponse;
import com.proy.entelgy.service.business.rule.PersonaService;

@RestController
@RequestMapping(path = "/personaz" + "/v1")
public class PersonaRestController {
	
	
	@Autowired
	private PersonaService personaService;	
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "reservation", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public PersonaResponse<String> createReservation(@RequestBody CreatePersonaRest createPersonaRest)
			 {
		return new PersonaResponse<>("Success", String.valueOf(HttpStatus.OK), "OK",
				personaService.reestructurar(createPersonaRest));

	}


}
