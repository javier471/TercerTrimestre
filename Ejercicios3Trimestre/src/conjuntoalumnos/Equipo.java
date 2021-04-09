package conjuntoalumnos;

import java.util.HashSet;
import java.util.Iterator;

import libreria.Publicacion;

public class Equipo {
	private String nombre;	
	private HashSet<Alumno>jugadores;
	
	
	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		HashSet<Alumno> jugadores=new HashSet<Alumno>();
	}

	public void sumarJugador(Alumno jugador) throws futbolException {
		if (!jugadores.add(jugador)) {
			throw new futbolException("Jugador existente");
		}
	}
	
	public void borrarJugador(Alumno jugador) throws futbolException {
		if (!jugadores.remove(jugador)) {
			throw new futbolException("No existe el jugador");
		}
	}
	
	public Alumno buscarJugador(Alumno jugador) {
		if(jugadores.contains(jugador)) {
			return jugador;
		}
		else {
			return null;
		}
	}
}