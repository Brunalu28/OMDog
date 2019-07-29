package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Voluntario;
import br.edu.ifpb.esperanca.daw2.filtros.UsuarioFiltro;

public class VoluntarioDAO extends DAO<Voluntario> {
	
	public VoluntarioDAO() {
		super(Voluntario.class);
	}

}
