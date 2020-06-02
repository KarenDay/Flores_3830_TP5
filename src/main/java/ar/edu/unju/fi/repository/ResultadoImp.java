package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Flores3830Tp5Application;
import ar.edu.unju.fi.model.Resultado;

@Repository("resultadoImp")
public class ResultadoImp implements IResultado {

	@Autowired
	private Resultado resultado;
	
	public static Logger LOG = LoggerFactory.getLogger(Flores3830Tp5Application.class);

	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar el resultado en la BD
		LOG.info("Se guardó el resultado");

	}

	@Override
	public Resultado mostrar() {
		// mostrará el resultado de la BD
		LOG.info("Mostrar resultado ");
		return resultado;
	}

	@Override
	public void eliminar() {
		// eliminará el resultado de la BD
		LOG.info("Se eliminó el resultado de la BD");

	}

	@Override
	public Resultado modificar() {
		// se modificará el resultado de la BD
		LOG.info("Se modificó el resultado");
		return resultado;
	}

}
