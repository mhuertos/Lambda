package n3_ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Alumne> clase = new ArrayList<Alumne>();
		
		clase.add(new Alumne("Jaume Fisses", 19, "PHP", 6.5));
		clase.add(new Alumne("Ariadna Lloveras", 27, "Java", 8.9));
		clase.add(new Alumne("Reinald Lupzig", 16, "PHP", 7.2));
		clase.add(new Alumne("Sofia Clarà", 26, "Java", 7.5));
		clase.add(new Alumne("Gorka Mendizaval", 17, "PHP", 5.0));
		clase.add(new Alumne("Bernat Fos", 22, "Java", 9.2));
		clase.add(new Alumne("Dalia Muntaner", 25, "PHP", 8.5));
		clase.add(new Alumne("Sonia Fernandez", 17, "Java", 9.5));
		clase.add(new Alumne("Michael Bounche", 21, "Java", 9.5));
		clase.add(new Alumne("Damian Durango", 24, "Java", 8.0));
		clase.add(new Alumne("Carrol James", 16, "Java", 4.2));
		
		clase.forEach(a -> System.out.println("Nom: "+a.getNom()+", "+a.getEdat()+" anys"));
		
		//////////////Noms que comencin per 'A'///////////////
		List<Alumne> nomsIniA = clase.stream()
				.filter(a -> a.getNom().startsWith("A"))
				.collect(Collectors.toList());
		
		System.out.println(nomsIniA);
		
		
		////////////Notes superiors a 5//////////////
		List<Alumne> aprovats = clase.stream()
				.filter(e -> e.getNota() >= 5.0)
				.collect(Collectors.toList());
		
		aprovats.forEach(e -> System.out.println(e));
		
		/////////////Nota superior a 5 i no PHP/////
		
		List<Alumne> noPhp = clase.stream()
				.filter(e -> e.getNota() >= 5 && !e.getCurs().matches("PHP"))
				.collect(Collectors.toList());
		noPhp.forEach(e-> System.out.println(e));
		
		/////////////Alumnes Java majors de 18 anys////////////////
		
		List<Alumne> adults = clase.stream()
				.filter(e -> e.getCurs().equalsIgnoreCase("Java") && e.getEdat() >= 18)
				.collect(Collectors.toList());
		adults.forEach(e -> System.out.println(e));
	}

}
