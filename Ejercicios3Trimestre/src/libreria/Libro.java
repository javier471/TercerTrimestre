package libreria;

public class Libro extends Publicacion implements Prestable {
	private boolean prestado;

	public Libro(int cod, String titulo, Tematica tematica, int anoPublicacion) {
		super(cod, titulo, tematica, anoPublicacion);
		this.prestado = false;
	}

	@Override
	public String toString() {
		return "Libro prestado=" + prestado + ", " + super.toString();
	}


	public void prestar() {
		this.prestado=true;
	}
	public void devolver() {
		this.prestado=false;
	}
	public boolean prestado() {
		return prestado;
	}
	

	@Override
	public int compareTo(Publicacion arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
