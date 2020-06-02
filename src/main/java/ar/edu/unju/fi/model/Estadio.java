package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
/**
 * 
 * @author Karen D. Flores
 *
 */
@Component
public class Estadio {
		//************* Atributos ****************
		/**
		 * Representa el nombre del Estadio
		 */
		private String nombre;
		/**
		 * Representa la fecha de fundacion del Estadio
		 */
		private LocalDate fechaFundacion;
		/**
		 * Representa la ciudad en donde se encuentra el Estadio
		 */
		private String ciudad;
		/**
		 * Representa la capacidad que tiene el Estadio
		 */
		private int capacidad;
		/**
		 * Representa la direccion del Estadio
		 */
		private String direccion;
		
		//**************** Constructores *************+
		
		/**
		 * Constructor por defecto 
		 */
		public Estadio() {
			// TODO Auto-generated constructor stub
		}


		/**
		 *  Constructor sobrecargado
		 * @param nombre
		 * @param fechaFundacion
		 * @param ciudad
		 * @param capacidad
		 * @param direccion
		 */
		public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
			this.nombre = nombre;
			this.fechaFundacion = fechaFundacion;
			this.ciudad = ciudad;
			this.capacidad = capacidad;
			this.direccion = direccion;
		}

		//***************** Metodos Accesores *****************
		
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
			this.nombre = nombre;
		}


		/**
		 * @return the fechaFundacion
		 */
		public LocalDate getFechaFundacion() {
			return fechaFundacion;
		}


		/**
		 * @param fechaFundacion the fechaFundacion to set
		 */
		public void setFechaFundacion(LocalDate fechaFundacion) {
			this.fechaFundacion = fechaFundacion;
		}


		/**
		 * @return the ciudad
		 */
		public String getCiudad() {
			return ciudad;
		}


		/**
		 * @param ciudad the ciudad to set
		 */
		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}


		/**
		 * @return the capacidad
		 */
		public int getCapacidad() {
			return capacidad;
		}


		/**
		 * @param capacidad the capacidad to set
		 */
		public void setCapacidad(int capacidad) {
			this.capacidad = capacidad;
		}


		/**
		 * @return the direccion
		 */
		public String getDireccion() {
			return direccion;
		}


		/**
		 * @param direccion the direccion to set
		 */
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		//*********** Sobre escritura *******************
		@Override
		public String toString() {
			return "Estadio [nombre=" + nombre + ", fechaFundacion=" + fechaFundacion + ", ciudad=" + ciudad
					+ ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
		}
		
		
		
		
		
		
		
		
}
