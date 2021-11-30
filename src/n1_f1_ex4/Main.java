package n1_f1_ex4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String[] paraules = {"Analogia", "Cuaderno", "Sistema", "Sustento", "Obra", "aloeverui"};

		IBuilder bldr = (lista, numLetras) -> {
			ArrayList<String> resultat = new ArrayList<String>();
			char[] lletres = {'a', 'e', 'i', 'o', 'u'};
			
			for(int i = 0; i < lista.length; i++) {
				int contador = 0;
				
				for(int j = 0; j < lista[i].length(); j++) {
					boolean trobat = false;
					int index = 0;
					
					while(!trobat && (index != lletres.length)) {
						char lletraParaula = lista[i].charAt(j);
						if(Character.compare(Character.toLowerCase(lletraParaula), lletres[index]) == 0) {
							trobat = true;
							contador++;
							if(contador == 5) {
								resultat.add(lista[i]);
							}
						}
						index++;
					}
				}	
			}
			return resultat;
		};
		System.out.println(bldr.run(paraules, 5));
	}
}
