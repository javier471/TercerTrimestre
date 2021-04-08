package ejemploshashsets;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> ciudades=new HashSet<String>();
		HashSet<Integer> numeros=new HashSet<Integer>();

		
		ciudades.add("Sevilla");
		ciudades.add("Málaga");
		ciudades.add("Cádiz");
		ciudades.add("Sevilla");
		
		for(String aux:ciudades) {
			System.out.println(aux);
		}
		
		Iterator<String> aux=ciudades.iterator();
		while (aux.hasNext()) {
			System.out.println(aux.hasNext());
		}
	}

}
