package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Flores3830Tp5Application;
import ar.edu.unju.fi.model.Estadio;

@Repository("estadioImp")
public class EstadioImp implements IEstadio {
	@Autowired
	private Estadio estadio;
	
	public static Logger LOG = LoggerFactory.getLogger(Flores3830Tp5Application.class);
	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto estadio a la BD
		LOG.info("El estadio fue guardado");

	}

	@Override
	public Estadio mostrar() {
		// Se mostrara el objeto estadio de la BD
		LOG.info("Mostrar los datos del estadio ");
		return estadio;
	}

	@Override
	public void eliminar() {
		// Se eliminará el objeto estadio de la BD
		LOG.info("Se eliminó el estadio de la BD");

	}

	@Override
	public Estadio modificar() {
		// Se modificará el objeto estadio de la BD
		LOG.info("Se modificó el estadio de la BD");
		return estadio;
	}

}
