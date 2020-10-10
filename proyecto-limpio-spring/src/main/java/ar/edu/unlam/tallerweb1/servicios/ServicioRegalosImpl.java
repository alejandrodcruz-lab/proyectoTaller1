package ar.edu.unlam.tallerweb1.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.CajaDeRegalo;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioRegalos;

@Service @Transactional
public class ServicioRegalosImpl implements ServicioRegalos{

	private RepositorioRegalos repositorio;
	
	@Autowired
	public ServicioRegalosImpl(RepositorioRegalos repositorio) {
		this.repositorio = repositorio;
	}
	
	@Override
	public void crear(CajaDeRegalo regalo) {
		if("".equals(regalo.getNombre())) throw new RuntimeException();

		repositorio.guardar(regalo);
	}

}
