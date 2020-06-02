package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
/**
 * 
 * @author Karen D. Flores
 *
 */
@Component
public class Noticia {
		//*********** Atributos ************
		/**
		 * Representa la fecha de la Noticia
		 */
		private LocalDate fecha;
		/**
		 * Representa el titulo de la Noticia
		 */
		private String titulo;
		/**
		 * Representa el resumen de la Noticia
		 */
		private String resumen;
		
		//**************** Constructores **************
		
		/**
		 * Constructor por defecto
		 */
		public Noticia() {
			
		}
		/**
		 * Constructor sobrecargado
		 * @param fecha
		 * @param titulo
		 * @param resumen
		 */
		public Noticia(LocalDate fecha, String titulo, String resumen) {
			this.fecha = fecha;
			this.titulo = titulo;
			this.resumen = resumen;
		}
		
		//************* Metodos Accesores *************+
		
		/**
		 * @return the fecha
		 */
		public LocalDate getFecha() {
			return fecha;
		}
		/**
		 * @param fecha the fecha to set
		 */
		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}
		/**
		 * @return the titulo
		 */
		public String getTitulo() {
			return titulo;
		}
		/**
		 * @param titulo the titulo to set
		 */
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		/**
		 * @return the resumen
		 */
		public String getResumen() {
			return resumen;
		}
		/**
		 * @param resumen the resumen to set
		 */
		public void setResumen(String resumen) {
			this.resumen = resumen;
		}
		
		// ************** Sobre escritura *************
		
		@Override
		public String toString() {
			return "Noticia [fecha=" + fecha + ", titulo=" + titulo + ", resumen=" + resumen + "]";
		}
		
		
		
		
		
}
