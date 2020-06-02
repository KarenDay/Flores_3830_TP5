package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Flores3830Tp5Application;
import ar.edu.unju.fi.model.Noticia;

@Repository("noticiaImp")
public class NoticiaImp implements INoticia {

	@Autowired
	private Noticia noticia;
	
	public static Logger LOG = LoggerFactory.getLogger(Flores3830Tp5Application.class);

	@Override
	public void guardar() {
		// Accion ejecutada para guardar el objeto noticia en la BD
		LOG.info("La noticia se guardó");

	}

	@Override
	public Noticia mostrar() {
		// Se mostrará la noticia de la BD
		LOG.info("Mostrar noticia");
		return noticia;
	}

	@Override
	public void eliminar() {
		// Se eliminará la noticia de la BD
		LOG.info("Se eliminó la noticia de la BD");
		

	}

	@Override
	public Noticia modificar() {
		// Se modificará la noticia de la BD
		LOG.info("Se modificó la noticia de la BD");
		return noticia;
	}

}
