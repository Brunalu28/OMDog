package br.edu.ifpb.esperanca.daw2.OMDog.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Voluntario;
import br.edu.ifpb.esperanca.daw2.services.VoluntarioService;

@ViewScoped
@Named
public class VoluntarioBean implements Serializable {

	@Inject
	private VoluntarioService service;

	protected Voluntario entidade;

	protected Collection<Voluntario> entidades;

	public VoluntarioBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Voluntario entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Voluntario getEntidade() {
		return entidade;
	}

	public void setEntidade(Voluntario entidade) {
		this.entidade = entidade;
	}

	public Collection<Voluntario> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Voluntario> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getService().save(entidade);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		entidades = getService().getAll();
		entidade = newEntidade();
	}

	protected Voluntario newEntidade() {
		return new Voluntario();
	}

	public VoluntarioService getService() {
		return service;
	}

}

