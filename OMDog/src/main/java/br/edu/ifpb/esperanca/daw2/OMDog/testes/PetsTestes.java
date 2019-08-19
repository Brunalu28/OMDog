package br.edu.ifpb.esperanca.daw2.OMDog.testes;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Pets;
import br.edu.ifpb.esperanca.daw2.services.PetsService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe Pets")
public class PetsTestes {
	
	@Test
	@DisplayName("Teste classe Pets")
	
	public void adicionaPet() {
		List<Pets> petss = new ArrayList<Pets>();
		for (int i = 0; i < 100; i++) {
			Pets p = new Pets();
			p.setNome("a"+(100-i));
			petss.add(p);
		}
		System.out.println(petss);
		System.out.println(petss);
		
		PetsService service = new PetsService();
		service.save(p);
		
		Pets a = new Pets();
		a.setLocalizaçao("Ong das Patinhas");



		}

	}

	
	
