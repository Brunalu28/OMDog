package br.edu.ifpb.esperanca.daw2.OMDog.testes;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Comentario;
import br.edu.ifpb.esperanca.daw2.services.ComentarioService;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe Comentario")
public class ComentarioTestes {
	
	@Test
	@DisplayName("Teste classe Comentario")
	
	public void adicionacomentario() {
		ComentarioService service = new ComentarioService();
			Comentario c = new Comentario(); 
			c.setTexto("Fofo dms, quero");
			service.save(c);
			
			assertNotNull(c.getId());
			
			Comentario c2 = service.getByID(c.getId());
			assertEquals(c, c2);
			
			service.update(c);
			
			Comentario c3 = service.getByID(0);
			
			assertEquals("Nossa, que cachorro bonito!", c3.getTexto());
			
			service.remove(c2);
			
			Comentario c4 = service.getByID(0);
			
			assertNull(c4);
			
			
		}
		
		}

	

