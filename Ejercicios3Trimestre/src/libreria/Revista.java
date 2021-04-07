package libreria;

public class Revista extends Publicacion{
	private int numero;

	public Revista(int cod, String titulo, Tematica tematica, int anoPublicacion,int numero) {
		super(cod, titulo, tematica, anoPublicacion);
		this.numero=numero;
	}

	@Override
	public String toString() {
		return "Revista [numero=" + numero + "]";
	}

	@Override
	public int compareTo(Publicacion arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
