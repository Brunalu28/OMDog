package br.edu.ifpb.esperanca.daw2.OMDog.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Pets implements Identificavel {
	
	@Id
	@GeneratedValue(generator="pets_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="pets_seq")
	private Long id;
	private String nome;
	private String raça;
	private String sexo;
	private String localizaçao;
	private String tamanho;
	private String deficiencia;
	
	@ManyToMany
	@JoinTable(name="voluntario_pet")
	private Set<Voluntario> possui;

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getRaça() {
		return raça;
	}



	public void setRaça(String raça) {
		this.raça = raça;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getLocalizaçao() {
		return localizaçao;
	}



	public void setLocalizaçao(String localizaçao) {
		this.localizaçao = localizaçao;
	}



	public String getTamanho() {
		return tamanho;
	}



	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}



	public String getDeficiencia() {
		return deficiencia;
	}



	public void setDeficiencia(String deficiencia) {
		this.deficiencia = deficiencia;
	}



	public Set<Voluntario> getPossui() {
		return possui;
	}



	public void setPossui(Set<Voluntario> possui) {
		this.possui = possui;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deficiencia == null) ? 0 : deficiencia.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((localizaçao == null) ? 0 : localizaçao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((possui == null) ? 0 : possui.hashCode());
		result = prime * result + ((raça == null) ? 0 : raça.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((tamanho == null) ? 0 : tamanho.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pets other = (Pets) obj;
		if (deficiencia == null) {
			if (other.deficiencia != null)
				return false;
		} else if (!deficiencia.equals(other.deficiencia))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (localizaçao == null) {
			if (other.localizaçao != null)
				return false;
		} else if (!localizaçao.equals(other.localizaçao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (possui == null) {
			if (other.possui != null)
				return false;
		} else if (!possui.equals(other.possui))
			return false;
		if (raça == null) {
			if (other.raça != null)
				return false;
		} else if (!raça.equals(other.raça))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (tamanho == null) {
			if (other.tamanho != null)
				return false;
		} else if (!tamanho.equals(other.tamanho))
			return false;
		return true;
	}


	public Pets() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}

