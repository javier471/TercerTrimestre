package libreria;

public abstract class Publicacion {
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

}
