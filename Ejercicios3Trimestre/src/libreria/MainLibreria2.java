package libreria;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MainLibreria2 {

	public static Scanner teclado = new Scanner(System.in);
	public static Publicacion array[] = new Publicacion[100];
	public static int numPublicaciones = 0;
	public static Set<Publicacion> libros=new HashSet<Publicacion>();
	
	public static void main(String[] args) {
		
		int opc;
		
		
		do {
			mostrarMenu();
			opc = leerEntero("Introduce una opción del menú");
			switch (opc) {
			case 1: {
				int codigo = leerEntero("Introduce el código del libro");
				String titulo = leerString("Introduce el titutlo del libro");
				Tematica tematica = Tematica.valueOf(leerString("Introduce la tematica del libro"));
				int anoPublicacion = leerEntero("Introduce el año de la publicación");
				Libro l1 = new Libro(codigo,titulo, tematica,anoPublicacion);
				libros.add(l1);
				break;
				}
			
			case 2:{ 
				int codigo = leerEntero("Introduce el código del libro");
				String titulo = leerString("Introduce el titutlo del libro");
				Tematica tematica = Tematica.valueOf(leerString("Introduce la tematica del libro"));
				int anoPublicacion = leerEntero("Introduce el año de la publicación");
				int numero = leerEntero("Introduce el número de la revista");
				Revista r1 = new Revista(codigo,titulo, tematica,anoPublicacion, numero);
				libros.add(r1);
				break;
				}
			case 3: {
				String titulo = leerString("Introduce el título de la revista o libro");
				Iterator<Publicacion> publi=libros.iterator();
				boolean encontrado=false;
				while (publi.hasNext()&& !encontrado) {
					Publicacion p=publi.next();
					if(p.getTitulo().equals(titulo)) {
						if (p instanceof Revista) {
							System.out.println("Las revistas no se prestan");
						}
						else if(((Libro)p).prestado()) {
							System.out.println("El libro está prestado");
						}
						else {
							System.out.println("El libro No está prestado");
						}
					}
				}
			}
				break;
			case 4: {
				String titulo = leerString("Introduce el título de la revista o libro");
				int pos = encuentraLibroRevista(titulo);
				if (pos == -1) System.out.println("Libro o revista no encontrada");
				else {
					if (array[pos] instanceof Libro) {
						Libro l = (Libro) array[pos];
						if (l.prestado())
							System.out.println("El libro está prestado");
						else
							l.prestar();
					
						
				}
			}
			}
				break;
			case 5: {
				String titulo = leerString("Introduce el título de la revista o libro");
				int pos = encuentraLibroRevista(titulo);
				if (pos == -1) System.out.println("Libro o revista no encontrada");
				else {
					if (array[pos] instanceof Libro) {
						Libro l = (Libro) array[pos];
						if (l.prestado())
							l.devolver();
						else
							System.out.println("El libro No está prestado");
					}else
						System.out.println("Las revistas no se prestan");
				}
		
				break;
			}
			case 6: {
				
				String titulo = leerString("Introduce el título de la revista o libro");
				Iterator<Publicacion> publi=libros.iterator();
				boolean encontrado=false;
				while (publi.hasNext()&& !encontrado) {
					Publicacion p=publi.next();
					if(p.getTitulo().equals(titulo)) {
						System.out.println(p);
					}
				}
			}
			case 7: 
				Arrays.sort(array, 0, numPublicaciones);
				for (int i=0; i < numPublicaciones; i++) {
					System.out.println(array[i]);
				}
				break;
			case 8: 
				System.out.println("Salidendo del sistema");
				break;
			default:
				System.out.println("Opción no permitida");
			}
		}while (opc!= 8);
		
		
		
	}
	
	public static void mostrarMenu() {
		System.out.println("1.- Dar de alta libro\n" +
				"2.- Dar de alta revista\n" +
				"3.- Comprobar si libro está prestado\n" +
				"4.- Prestar libro\n" +
				"5.- Devolver libro\n" +
				"6.- Mostrar información\n" +
				"7.- Mostrar el catálogo\n" +
				"8.- Salir");
	}

	public static int leerEntero(String cadena) {
		System.out.println(cadena);
		int resul = Integer.parseInt(teclado.nextLine());
		return resul;
	}
	
	public static String leerString(String cadena) {
		System.out.println(cadena);
		String resul = teclado.nextLine();
		return resul;
	}
	
	public static int encuentraLibroRevista(String nombre) {
		
		for (int i=0; i<numPublicaciones; i++) {
			if (nombre.equals(array[i].getTitulo())) {
				return i;
			}
		}
		return -1;
	}
}