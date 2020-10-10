package ar.edu.unlam.tallerweb1.repositorios;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.CajaDeRegalo;

@Repository
public class RepositorioRegalosDatabase implements RepositorioRegalos {

	@Autowired
	private SessionFactory factory;
	
	@Override
	public void guardar(CajaDeRegalo regalo) {
		factory.getCurrentSession().save(regalo);
	}

}
