package n1_f1_ex6;


public class App {

	public static void main(String[] args) {
		
		////////////////Referencia a métodos estáticos/////////////////////////
		IBuilder ib = Methods::convertirGato;
		ib.run();
		
		////////////////Referencia a Métodos no estáticos//////////////////////
		
		Methods m = new Methods();
		ib = m::convertirElefante;
		ib.run();
		
		ib = m::convertirLoro;
		ib.run();
		
		ib = Methods::new;
		ib.run();
		
		
		
		
	}
}
