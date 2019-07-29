package br.edu.ifpb.esperanca.daw2.OMDog.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Adotante;
import br.edu.ifpb.esperanca.daw2.services.AdotanteService;

@ViewScoped
@Named
public class AdotanteBean implements Serializable {

	@Inject
	private AdotanteService service;

	protected Adotante entidade;

	protected Collection<Adotante> entidades;

	public AdotanteBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Adotante entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Adotante getEntidade() {
		return entidade;
	}

	public void setEntidade(Adotante entidade) {
		this.entidade = entidade;
	}

	public Collection<Adotante> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Adotante> entidades) {
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

	protected Adotante newEntidade() {
		return new Adotante();
	}

	public AdotanteService getService() {
		return service;
	}

}
//
//
