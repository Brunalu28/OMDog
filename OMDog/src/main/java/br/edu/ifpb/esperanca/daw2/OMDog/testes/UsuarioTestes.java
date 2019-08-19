package br.edu.ifpb.esperanca.daw2.OMDog.testes;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Pets;
import br.edu.ifpb.esperanca.daw2.OMDog.entities.Usuario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe Usuario")
public class UsuarioTestes {
	
	@Test
	@DisplayName("Teste classe Usuario")
	
	public void adicionaUsuario() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		for (int i = 0; i < 100; i++) {
			Usuario u = new Usuario();
			u.setNome("a"+(100-i));
			usuarios.add(u);
	}
		System.out.println(usuarios);
		System.out.println(usuarios);
	

}
}
