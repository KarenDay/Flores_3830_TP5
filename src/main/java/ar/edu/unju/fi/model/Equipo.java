
package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Karen D. Flores
 *
 */
@Component
public class Equipo {
	//********** Atributos ****************
	/**
	 * Representa el nombre del Equipo
	 */
		private String nombre;
	/**
	 * Representa el estadio del Equipo
	 */
		@Autowired 
		private Estadio estadio;
		
	//************** Constructores *************
	/**
	 * Constructor por defecto	
	 */
	public Equipo() {
		
	}
	/**
	 * Constructor sobrecargado
	 * @param nombre
	 * @param estadio
	 */
	public Equipo(String nombre, Estadio estadio) {
		nombre = nombre;
		this.estadio = estadio;
	}
	
	//*********** Metodos Accesores *******************
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		nombre = nombre;
	}
	/**
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}
	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	//********** Sobre escritura **************
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}
	
	
	
		
}
