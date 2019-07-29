package br.edu.ifpb.esperanca.daw2.OMDog.entities;

import java.util.Date;
import java.util.List;

public class Adotante extends Usuario{
	

	private Date nascimento;
	private List<Pets>adotados;
	
	public Date getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
		
	}

	public List<Pets> getAdotados() {
		return adotados;
	}

	public void setAdotados(List<Pets> adotados) {
		this.adotados = adotados;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adotados == null) ? 0 : adotados.hashCode());
		result = prime * result + ((nascimento == null) ? 0 : nascimento.hashCode());
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
		Adotante other = (Adotante) obj;
		if (adotados == null) {
			if (other.adotados != null)
				return false;
		} else if (!adotados.equals(other.adotados))
			return false;
		if (nascimento == null) {
			if (other.nascimento != null)
				return false;
		} else if (!nascimento.equals(other.nascimento))
			return false;
		return true;
	}


}
//
//