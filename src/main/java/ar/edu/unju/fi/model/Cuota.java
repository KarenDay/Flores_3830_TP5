package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Karen D. Flores
 *
 */
@Component
public class Cuota {
		//************ Atributos ***************
		/**
		 * Representa el numero de identificacion de la cuota
		 */
		private long id;
		/**
		 * Representa la fecha de pafo de la cuota
		 */
		private LocalDate fechaPago;
		/**
		 * Representa el periodo 
		 */
		private String periodo;
		/**
		 * Representa el monto de pago de la cuota
		 */
		private double monto;
		/**
		 * Representa el estado de la cuota
		 */
		private String estado;
		/**
		 * Representa los datos de usuario al que pertenece la cuota
		 */
		@Autowired
		private Usuario usuario;
		
		//************* Constructores ******************
		
		/**
		 * Constructor por  defecto
		 */
		public Cuota() {
			// TODO Auto-generated constructor stub
		}
		
		/**
		 * Constructor sobrecargado
		 * @param id
		 * @param fechaPago
		 * @param periodo
		 * @param monto
		 * @param estado
		 * @param usuario
		 */
		public Cuota(long id, LocalDate fechaPago, String periodo, double monto, String estado, Usuario usuario) {
			this.id = id;
			this.fechaPago = fechaPago;
			this.periodo = periodo;
			this.monto = monto;
			this.estado = estado;
			this.usuario = usuario;
		}
		
		//*************** Metodos accesores *************
		
		/**
		 * @return the id
		 */
		public long getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(long id) {
			this.id = id;
		}
		/**
		 * @return the fechaPago
		 */
		public LocalDate getFechaPago() {
			return fechaPago;
		}
		/**
		 * @param fechaPago the fechaPago to set
		 */
		public void setFechaPago(LocalDate fechaPago) {
			this.fechaPago = fechaPago;
		}
		/**
		 * @return the periodo
		 */
		public String getPeriodo() {
			return periodo;
		}
		/**
		 * @param periodo the periodo to set
		 */
		public void setPeriodo(String periodo) {
			this.periodo = periodo;
		}
		/**
		 * @return the monto
		 */
		public double getMonto() {
			return monto;
		}
		/**
		 * @param monto the monto to set
		 */
		public void setMonto(double monto) {
			this.monto = monto;
		}
		/**
		 * @return the estado
		 */
		public String getEstado() {
			return estado;
		}
		/**
		 * @param estado the estado to set
		 */
		public void setEstado(String estado) {
			this.estado = estado;
		}
		/**
		 * @return the usuario
		 */
		public Usuario getUsuario() {
			return usuario;
		}
		/**
		 * @param usuario the usuario to set
		 */
		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		//**************** Sobre escritura ***************+
		@Override
		public String toString() {
			return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", periodo=" + periodo + ", monto=" + monto
					+ ", estado=" + estado + ", usuario=" + usuario + "]";
		}
		
		
}
