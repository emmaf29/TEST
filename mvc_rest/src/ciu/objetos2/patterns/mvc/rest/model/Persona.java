package ciu.objetos2.patterns.mvc.rest.model;

public class Persona {
	public class Persona {
		private String nombre;
		private String apellidos;
		private Integer edad;
		
		public Persona(String nomb,String apelli,Integer edad) {
			super();
			this.nombre = nomb;
			this.apellidos = apelli;
			this.edad = edad;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public Integer getEdad() {
			return edad;
		}

		public void setEdad(Integer edad) {
			this.edad = edad;
		}
	}

}
