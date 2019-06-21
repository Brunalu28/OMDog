package br.edu.ifpb.esperanca.daw2.OMDog.entities;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.OMDog.entities.Adotante;
import br.edu.ifpb.esperanca.daw2.dao.AdotanteDAO;
import br.edu.ifpb.esperanca.daw2.services.Service;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

@ApplicationScoped
public class AdotanteService implements Serializable, Service<Adotante> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private AdotanteDAO AdotanteDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Adotante adotante) {
		AdotanteDAO.save(adotante);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Adotante adotante)  {
		AdotanteDAO.update(adotante);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Adotante adotante) {
		AdotanteDAO.remove(adotante);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Adotante getByID(long AdotanteId)  {
			return AdotanteDAO.getByID(AdotanteId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Adotante> getAll() {
			return AdotanteDAO.getAll();
	}
}
