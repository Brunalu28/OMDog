package br.edu.ifpb.esperanca.daw2.OMDog.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Pets;
import br.edu.ifpb.esperanca.daw2.services.PetsService;

@ViewScoped
@Named
public class PetsBean implements Serializable {

	@Inject
	private PetsService service;

	protected Pets entidade;

	protected Collection<Pets> entidades;

	public PetsBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Pets entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Pets getEntidade() {
		return entidade;
	}

	public void setEntidade(Pets entidade) {
		this.entidade = entidade;
	}

	public Collection<Pets> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Pets> entidades) {
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

	protected Pets newEntidade() {
		return new Pets();
	}

	public PetsService getService() {
		return service;
	}

}
