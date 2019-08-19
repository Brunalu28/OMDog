package br.edu.ifpb.esperanca.daw2.OMDog.testes;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Pets;
import br.edu.ifpb.esperanca.daw2.services.PetsService;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe Pets")
public class PetsTestes {
	
	@Test
	@DisplayName("Teste classe Pets")
	
	public void adicionaPet() {
		PetsService service = new PetsService();
			Pets p = new Pets();
			p.setLocalizaçao("Ong das Patinhas");
			service.save(p);
			
			assertNotNull(p.getId());
			
			Pets p2 = service.getByID(p.getId());
			assertEquals(p, p2);
			
			service.update(p);
			
			Pets p3 = service.getByID(0);
			
			assertEquals("Casa da Bruna", p3.getLocalizaçao());
			
			service.remove(p2);
			
			Pets p4 = service.getByID(0);
			
			assertNull(p4);
			
			
		}
		
		}

	

