package n1_f1_ex3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String[] paraules = {"Analogía", "Cuaderno", "Sistema", "Sustento", "Obra"};
		
		
		IBuilder bldr = (lista, letra) -> {	
			ArrayList<String> array = new ArrayList<String>();
	
			for(int i = 0; i < lista.length; i++) {
				for(int j = 0; j < lista[i].length(); j++) {
					char letraInWord = Character.toLowerCase(lista[i].charAt(j));
					if(letra.compareTo(letraInWord) == 0) {
						array.add(lista[i]);
					}
				}
			}
			return array;
		};
		System.out.println(bldr.run(paraules, 'o'));		
	}
}


