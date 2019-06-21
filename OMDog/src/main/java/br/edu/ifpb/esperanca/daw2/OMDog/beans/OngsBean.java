package br.edu.ifpb.esperanca.daw2.OMDog.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Ongs;
import br.edu.ifpb.esperanca.daw2.services.OngsService;

@ViewScoped
@Named
public class OngsBean implements Serializable {

	@Inject
	private OngsService service;

	protected Ongs entidade;

	protected Collection<Ongs> entidades;

	public OngsBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Ongs entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Ongs getEntidade() {
		return entidade;
	}

	public void setEntidade(Ongs entidade) {
		this.entidade = entidade;
	}

	public Collection<Ongs> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Ongs> entidades) {
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

	protected Ongs newEntidade() {
		return new Ongs();
	}

	public OngsService getService() {
		return service;
	}

}

