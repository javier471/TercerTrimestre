package conjuntoalumnos;

public class Alumno {
	private String nombre;
	private String DNI;
	
	public Alumno(String nombre, String dNI) {
		super();
		this.nombre = nombre;
		DNI = dNI;
	}
	
	
	public String getDNI() {
		return DNI;
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", DNI=" + DNI + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	

}
