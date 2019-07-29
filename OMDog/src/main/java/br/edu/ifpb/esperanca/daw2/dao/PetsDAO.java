package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Pets;
import br.edu.ifpb.esperanca.daw2.filtros.UsuarioFiltro;

public class PetsDAO extends DAO<Pets> {
	
	public PetsDAO() {
		super(Pets.class);
	}

}
