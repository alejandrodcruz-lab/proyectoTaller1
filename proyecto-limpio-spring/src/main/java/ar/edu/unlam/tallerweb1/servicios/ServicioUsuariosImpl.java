package ar.edu.unlam.tallerweb1.servicios;

import java.util.LinkedList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioUsuario;

@Service
@Transactional
public class ServicioUsuariosImpl implements ServicioUsuario {

	@Autowired
	private RepositorioUsuario repositorioUsuario;

	@Override
	public List<Usuario> buscarUsuarioPorRol(String rol) {

		final List<Usuario> lista = repositorioUsuario.todos();

		if (lista.isEmpty()) {

			throw new RuntimeException("No hay usuarios en la base");

		}

		List<Usuario> listaFiltrada = new LinkedList<>();
		for (Usuario usuario : lista) {
			if (usuario.getRol().equals(rol)) {
				listaFiltrada.add(usuario);
			}
		}
		return listaFiltrada;
	}

}
