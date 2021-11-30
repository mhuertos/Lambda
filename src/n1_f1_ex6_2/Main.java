package n1_f1_ex6_2;

public class Main {
	
	private static String[] meses = {"Enero", "Febrero", "Marzo", "Abril",
			  "Mayo", "Junio", "Julio", "Agosto",
			  "Septiembre", "Octubre", "Noviembre", "Diciembre"};

	public static void main(String[] args) {

		IBuilder ib = Main::imprimeMeses;
		ib.run(meses);
		
	}
	
	public static void imprimeMeses(String[] lista) {
		for(String e: meses) {
			System.out.println(e);
		}
	}
}
