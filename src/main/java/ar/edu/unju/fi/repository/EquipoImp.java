package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Flores3830Tp5Application;
import ar.edu.unju.fi.model.Equipo;

@Repository("equipoImp")
public class EquipoImp implements IEquipo {
    
	@Autowired
	private Equipo equipo;
	
	public static Logger LOG = LoggerFactory.getLogger(Flores3830Tp5Application.class);
	
	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto
		LOG.info("El equipo fue guardado");

	}

	@Override
	public Equipo mostrar() {
		// Se recupera todos los datos del Equipo
		LOG.info("Mostrar los datos del equipo");
		return equipo;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto equipo de la BD
		LOG.info("Se elimina el equipo de la base de datos");
	}

	@Override
	public Equipo modificar() {
		// Se modifica el objeto equipo de la base de datos
		return equipo;
	}

}
