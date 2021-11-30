package n2_ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Empleado> personal = new ArrayList<Empleado>();
		
		personal.add(new Empleado("Juan", 32));
		personal.add(new Empleado("Ainhoa", 41));
		personal.add(new Empleado("Neyara", 65));
		personal.add(new Empleado("Terrisano", 14));
		personal.add(new Empleado("David", 5));
		
		////////Ordenación por longitud de nombre//////////
		//Collections.sort(personal, Empleado::sortByLongitud);
		//System.out.println(personal);
		
		////////Ordenación por longitud a la inversa//////
		//Collections.sort(personal, (e1, e2) -> e2.getLongitud()-e1.getLongitud());
		//personal.forEach(e -> System.out.println(e));
		
		///////Ordenació per ordre alfabétic del primer caracter/////////////
		//Collections.sort(personal, (e1, e2) -> e1.getNombre().compareTo(e2.getNombre()));
		//personal.forEach(e -> System.out.println(e));
		
		
		////////Ordenación por nombres con E//////////////////
		List <Empleado> nombresConE = personal.stream()
									.sorted(Comparator.comparing(e -> e.getNombre().length()))
									.sorted(Comparator.comparing(e -> !e.getNombre().contains("e")))
									.collect(Collectors.toList());		
		//nombresConE.forEach(e -> System.out.println(e.getNombre()));
		
		
		//////////Cambio de 'a' por '4'///////////////////////
		List <String> canvioA4 = personal
								   .stream()
								   .map(e -> e.getNombre().replaceAll("(?i)a", "4"))
								   .collect(Collectors.toList());
		//System.out.println(canvioA4);
		
		////////////////Valores 100% numericos//////////////
		
		List<Empleado> personal2 = new ArrayList<Empleado>();
		
		personal2.add(new Empleado("Juan", 32));
		personal2.add(new Empleado("Ainhoa", 41));
		personal2.add(new Empleado("Neyara", 65));
		personal2.add(new Empleado("Terrisano", 14));
		personal2.add(new Empleado("David", 5));
		personal2.add(new Empleado("2345", 76));
		personal2.add(new Empleado("341", 98));
		
		List<Empleado> nomesNum = personal2.stream()
								.filter(e -> e.getNombre().matches("[0-9]+"))
								.collect(Collectors.toList());
		//nomesNum.forEach(e -> System.out.println(e.getNombre()));
		
		/////////Implementant interface funcional////////////////
		//Suma:
		Demo suma = (x, y) -> x+y;
		System.out.println(suma.operacio(3.4, 5.6));
		
		//Resta:
		Demo resta = (x, y) -> x-y;
		System.out.println(resta.operacio(4.5, 3.9));
		
		//Multiplicacio:
		Demo mult = (x, y) -> x*y;
		System.out.println(mult.operacio(4.2, 1.8));
		
		//Divisio:
		Demo div = (x, y) -> x / y;
		System.out.println(div.operacio(6.2, 4.1));
		
		
		
		
		
		
		
		
		
		
		
	}
}

