package br.edu.ifpb.esperanca.daw2.OMDog.testes;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.services.UserService;

@DisplayName("Um teste para a classe Usuario")
public class UsuarioTestes {

	@Test
	@DisplayName("Teste classe Usuario")
	public void adicionaUsuario() {
		UserService service = new UserService();

		Usuario u = new Usuario();
		u.setNome("a");
		service.save(u);
		
		assertNotNull(u.getId());
		
		Usuario u2 = service.getByID(u.getId());
		
		assertEquals(u, u2);
		
		
		service.update(user);
		
		service.remove(u2);

	}
}
