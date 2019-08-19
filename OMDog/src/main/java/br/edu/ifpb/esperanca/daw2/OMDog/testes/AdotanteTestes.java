package br.edu.ifpb.esperanca.daw2.OMDog.testes;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Adotante;
import br.edu.ifpb.esperanca.daw2.services.AdotanteService;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe Adotante")
public class AdotanteTestes {
	
	@Test
	@DisplayName("Teste classe Adotante")
	
	public void adicionaAdotante() {
		AdotanteService service = new AdotanteService();
			Adotante a = new Adotante();
			a.getEmail();
			service.save(a);
			
			assertNotNull(a.getId());
			
			Adotante a2 = service.getByID(a.getId());
			assertEquals(a, a2);
			
			service.update(a);
			
			Adotante a3 = service.getByID(0);
			
			assertEquals("anapalbinosouza@gmail.com", a3.getEmail());
			
			service.remove(a2);
			
			Adotante a4 = service.getByID(0);
			
			assertNull(a4);
			
			
		}
		
		}

	

