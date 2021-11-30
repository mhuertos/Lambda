package n1_f3_ex1;

public class Main {

	public static void main(String[] args) {
		String word = "Holanda";
		
		IFace i_face = (palabra) -> {
			StringBuilder nueva_word = new StringBuilder();
			for(int i = palabra.length() -1; i >= 0; i--) {
				nueva_word.append(palabra.charAt(i));
			}
			return nueva_word.toString();
		};
		
		
		String palabra_revertida = i_face.reverse(word);
		System.out.println(palabra_revertida);

	}

}
