package br.edu.ifpb.esperanca.daw2.OMDog.testes;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Pets;
import br.edu.ifpb.esperanca.daw2.OMDog.entities.Voluntario;
import br.edu.ifpb.esperanca.daw2.services.VoluntarioService;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe Voluntario")
public class VoluntarioTestes {
	
	@Test
	@DisplayName("Teste classe Voluntario")
	
	public void adicionaPet() {
		VoluntarioService service = new VoluntarioService();
			Voluntario v = new Voluntario();
			v.getTelefone();
			service.save(v);
			
			assertNotNull(v.getId());
			
			Voluntario v2 = service.getByID(v.getId());
			assertEquals(v, v2);
			
			service.update(v);
			
			Voluntario v3 = service.getByID(0);
			
			assertEquals("9999999", v3.getTelefone());
			
			service.remove(v2);
			
			Voluntario v4 = service.getByID(0);
			
			assertNull(v4);
			
			
		}
		
		}

	

