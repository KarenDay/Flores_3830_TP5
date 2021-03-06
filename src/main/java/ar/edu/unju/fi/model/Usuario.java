package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
/**
 * 
 * @author Karen D. Flores
 *
 */
@Component
public class Usuario {
		//*********** Atributos ****************
		/**
		 * Representa el numero de identificacion del usuario
		 */
		private long id;
		/**
		 * Representa el nombre del usuario
		 */
		private String nombre;
		/**
		 * Representa el apellido del usuario
		 */
		private String apellido;
		/**
		 * Representa la fecha de nacimiento del usuario
		 */
		private LocalDate fechaNacimiento;
		/**
		 * Representa la direccion del usuario
		 */
		private String direccion;
		/**
		 * Representa el dni del usuario
		 */
		private long dni ;
		/**
		 *  Representa la fecha de Alta del usuario
		 */
		private LocalDate fechaAlta;
		/**
		 * Representa el tipo de usuario, solo puede ser SOCIO , ADMIN o CONSULTOR
		 */
		private String tipo;
		/**
		 * Representa la contraseña del usuario
		 */
		private String password;
		
		//*************** Constructor **************
		
		/**
		 *  Constructor por defecto
		 */
		public Usuario() {
			// TODO Auto-generated constructor stub
		}
		
		/**
		 * Constructor sobrecargado
		 * @param id
		 * @param nombre
		 * @param apellido
		 * @param fechaNacimiento
		 * @param direccion
		 * @param dni
		 * @param fechaAlta
		 * @param tipo
		 * @param password
		 */
		public Usuario(long id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, long dni,
				LocalDate fechaAlta, String tipo, String password) {
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaNacimiento = fechaNacimiento;
			this.direccion = direccion;
			this.dni = dni;
			this.fechaAlta = fechaAlta;
			this.tipo = tipo;
			this.password = password;
		}
		
		//************* Metodos Accesores *****************
		
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
		 * @return the apellido
		 */
		public String getApellido() {
			return apellido;
		}
		/**
		 * @param apellido the apellido to set
		 */
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		/**
		 * @return the fechaNacimiento
		 */
		public LocalDate getFechaNacimiento() {
			return fechaNacimiento;
		}
		/**
		 * @param fechaNacimiento the fechaNacimiento to set
		 */
		public void setFechaNacimiento(LocalDate fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
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
		/**
		 * @return the dni
		 */
		public long getDni() {
			return dni;
		}
		/**
		 * @param dni the dni to set
		 */
		public void setDni(long dni) {
			this.dni = dni;
		}
		/**
		 * @return the fechaAlta
		 */
		public LocalDate getFechaAlta() {
			return fechaAlta;
		}
		/**
		 * @param fechaAlta the fechaAlta to set
		 */
		public void setFechaAlta(LocalDate fechaAlta) {
			this.fechaAlta = fechaAlta;
		}
		/**
		 * @return the tipo
		 */
		public String getTipo() {
			return tipo;
		}
		/**
		 * @param tipo the tipo to set
		 */
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		/**
		 * @return the password
		 */
		public String getPassword() {
			return password;
		}
		/**
		 * @param password the password to set
		 */
		public void setPassword(String password) {
			this.password = password;
		}
		
		//******** Sobre escritura ***************
		@Override
		public String toString() {
			return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
					+ fechaNacimiento + ", direccion=" + direccion + ", dni=" + dni + ", fechaAlta=" + fechaAlta
					+ ", tipo=" + tipo + ", password=" + password + "]";
		}
		
		
		
}
