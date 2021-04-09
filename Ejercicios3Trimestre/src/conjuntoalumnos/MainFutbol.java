package conjuntoalumnos;

public class MainFutbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipo e1=new Equipo("Madrid");
		
		try {
			Alumno a1=new Alumno("Juan","229");
			e1.sumarJugador(a1);
		}catch(futbolException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Error inesperado");
		}
		
		System.out.println(e1.toString());
		try {
			Alumno a1=new Alumno("Juan","229");
		}
	}

}
