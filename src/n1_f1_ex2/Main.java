package n1_f1_ex2;

public class Main {

	public static void main(String[] args) {
		
		int[] listaNums = {54, 21, 23, 34};
		StringBuilder sb = new StringBuilder();
		
		IBuilder buldr = (x, y) -> {
			for(int i = 0; i < x.length; i++) {
				if(x[i] % 2 == 0) {
					y.append("e"+x[i]+", ");
				}else {
					y.append("o"+x[i]+", ");
				}
			}
			return y.toString();
		};
		System.out.println(buldr.run(listaNums, sb));
	}
}
