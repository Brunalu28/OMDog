package br.edu.ifpb.esperanca.daw2.OMDog.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Identificavel;
import br.edu.ifpb.esperanca.daw2.OMDog.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.dao.DAO;
import br.edu.ifpb.esperanca.daw2.dao.UsuarioDAO;

@FacesConverter(forClass=Usuario.class)
public class UsuarioConverter implements Converter {

	@Inject
	private UsuarioDAO usuarioDAO;
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		return usuarioDAO.getByID(Long.parseLong(id));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object entidade) {
		return ((Identificavel)entidade).getId().toString();
	}

	
	
}
