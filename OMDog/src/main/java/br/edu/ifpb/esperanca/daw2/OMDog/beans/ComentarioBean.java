package br.edu.ifpb.esperanca.daw2.OMDog.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Comentario;
import br.edu.ifpb.esperanca.daw2.services.ComentarioService;

@ViewScoped
@Named
public class ComentarioBean implements Serializable {

	@Inject
	private ComentarioService service;

	protected Comentario entidade;

	protected Collection<Comentario> entidades;

	public ComentarioBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Comentario entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Comentario getEntidade() {
		return entidade;
	}

	public void setEntidade(Comentario entidade) {
		this.entidade = entidade;
	}

	public Collection<Comentario> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Comentario> entidades) {
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

	protected Comentario newEntidade() {
		return new Comentario();
	}

	public ComentarioService getService() {
		return service;
	}

}

