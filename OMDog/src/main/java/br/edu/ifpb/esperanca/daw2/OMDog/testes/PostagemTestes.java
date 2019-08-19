package br.edu.ifpb.esperanca.daw2.OMDog.testes;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Postagem;

import br.edu.ifpb.esperanca.daw2.services.PostagemService;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe Pets")
public class PostagemTestes {
	
	@Test
	@DisplayName("Teste classe Postagem")
	
	public void adicionaPostagem() {
		PostagemService service = new PostagemService();
			Postagem g = new Postagem();
			g.getConteudo();
			service.save(g);
			
			assertNotNull(g.getId());
			
			Postagem g2 = service.getByID(g.getId());
			assertEquals(g, g2);
			
			service.update(g);
			
			Postagem g3 = service.getByID(0);
			
			assertEquals(165, g3.getConteudo());
			
			service.remove(g2);
			
			Postagem g4 = service.getByID(0);
			
			assertNull(g4);
			
			
		}
		
		}

	

