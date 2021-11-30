package n1_f1_ex1;

public class Main{

	public static void main(String[] args) {
		
		String[] listaNoms = new String[4];
		listaNoms[0] = "Marcos";
		listaNoms[1] = "Aron";
		listaNoms[2] = "Martina";
		listaNoms[3] = "Sara";

		MiInterfaz miInterfaz = (char x, String[] arrayL) -> {
			for(int i = 0; i < arrayL.length; i++) {
				if(arrayL[i].charAt(0) == x) {
					System.out.println(arrayL[i]);
				}
			}
		};
		
		miInterfaz.run('A', listaNoms);
		
	}
}
