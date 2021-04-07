package libreria;

enum Tematica {
	 Aventura, Historia, Acción;
}

public abstract class Publicacion implements Comparable<Publicacion> {
	private int cod;
	private String titulo;
	private Tematica tematica;
	private int anoPublicacion;
	



	public Publicacion(int cod, String titulo, Tematica tematica, int anoPublicacion) {
		super();
		this.cod = cod;
		this.titulo = titulo;
		this.tematica = tematica;
		this.anoPublicacion = anoPublicacion;
	}

	@Override
	public String toString() {
		return "Publicacion [cod=" + cod + ", titulo=" + titulo + ", anoPublicacion=" + anoPublicacion + "]";
	}

	public int getCod() {
		return cod;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}
	

	public String getTitulo() {
		return titulo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Publicacion other = (Publicacion) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

}
