package br.edu.ifpb.esperanca.daw2.OMDog.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Postagem;
import br.edu.ifpb.esperanca.daw2.services.PostagemService;

@ViewScoped
@Named
public class PostagemBean implements Serializable {

	@Inject
	private PostagemService service;

	protected Postagem entidade;

	protected Collection<Postagem> entidades;

	public PostagemBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Postagem entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Postagem getEntidade() {
		return entidade;
	}

	public void setEntidade(Postagem entidade) {
		this.entidade = entidade;
	}

	public Collection<Postagem> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Postagem> entidades) {
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

	protected Postagem newEntidade() {
		return new Postagem();
	}

	public PostagemService getService() {
		return service;
	}

}

