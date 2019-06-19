package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Ongs;
import br.edu.ifpb.esperanca.daw2.filtros.UsuarioFiltro;

public class OngsDAO extends DAO<Ongs> {
	
	public OngsDAO() {
		super(Ongs.class);
	}

	public List<Ongs> findBy(UsuarioFiltro filtro) {
		return null;
	}
	
}
