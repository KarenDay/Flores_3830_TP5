package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Flores3830Tp5Application;
import ar.edu.unju.fi.model.Cuota;

@Repository("cuotaImp")
public class CuotaImp implements ICuota {

	@Autowired
	private Cuota cuota;
	
	public static Logger LOG = LoggerFactory.getLogger(Flores3830Tp5Application.class);
	
	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto cuota en la BD
		LOG.info("La cuota fue guardada");
	}

	@Override
	public Cuota mostrar() {
		//Se recupera los datos de la cuota
		LOG.info("Mostrar cuota");
		return cuota;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto cuota de la BD
		LOG.info("Se eliminó la cuota de la BD");

	}

	@Override
	public Cuota modificar() {
		// Se modifica el objeto cuota de la BD
		LOG.info("Se modificó la cuota de la BD");
		return cuota;
	}

}
