package n1_f1_ex5;

public class Main {

	public static void main(String[] args) {
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril",
						  "Mayo", "Junio", "Julio", "Agosto",
						  "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		IBuilder bldr = months -> {
			for(String month: months){
				System.out.println(month);
			};
		};
		
		bldr.run(meses);
	}
}
