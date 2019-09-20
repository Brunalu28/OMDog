package br.edu.ifpb.esperanca.daw2.OMDog.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

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
	     
    private UploadedFile file;
	 
    public UploadedFile getFile() {
	        return file;
	    }
	 
    public void setFile(UploadedFile file) {
	        this.file = file;
	    }
	     
    public void upload() {
	        if(file != null) {
	            FacesMessage message = new FacesMessage("Succesful", file.getFileName() + " is uploaded.");
	            FacesContext.getCurrentInstance().addMessage(null, message);
	        }
	    }
	     
    public void handleFileUpload(FileUploadEvent event) {
	        FacesMessage msg = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
	        FacesContext.getCurrentInstance().addMessage(null, msg);
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

