package n1_f1_ex6;


public class App {

	public static void main(String[] args) {
		
		////////////////Referencia a m�todos est�ticos/////////////////////////
		IBuilder ib = Methods::convertirGato;
		ib.run();
		
		////////////////Referencia a M�todos no est�ticos//////////////////////
		
		Methods m = new Methods();
		ib = m::convertirElefante;
		ib.run();
		
		ib = m::convertirLoro;
		ib.run();
		
		ib = Methods::new;
		ib.run();
		
		
		
		
	}
}
