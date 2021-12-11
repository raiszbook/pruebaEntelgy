package com.proy.entelgy.service.business.rule;

import com.proy.entelgy.rest.jsons.CreatePersonaRest;

public interface PersonaService {
	
	String reestructurar(CreatePersonaRest createPersonaRest);
	
	String crearPersona(CreatePersonaRest createPersonaRest);

}
