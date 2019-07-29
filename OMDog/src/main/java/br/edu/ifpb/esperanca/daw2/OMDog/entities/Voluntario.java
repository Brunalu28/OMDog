package br.edu.ifpb.esperanca.daw2.OMDog.entities;

import java.util.Set;

import javax.persistence.ManyToMany;

public class Voluntario extends Usuario {
	
	private String localizaçao;
	
	@ManyToMany(mappedBy="possui")
	private Set<Pets> pets;
	
	
	public String getLocalizaçao() {
		return localizaçao;
	}
	public void setLocalizaçao(String localizaçao) {
		this.localizaçao = localizaçao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((localizaçao == null) ? 0 : localizaçao.hashCode());
		result = prime * result + ((pets == null) ? 0 : pets.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voluntario other = (Voluntario) obj;
		if (localizaçao == null) {
			if (other.localizaçao != null)
				return false;
		} else if (!localizaçao.equals(other.localizaçao))
			return false;
		if (pets == null) {
			if (other.pets != null)
				return false;
		} else if (!pets.equals(other.pets))
			return false;
		return true;
	}
	
	
	

}
//
//