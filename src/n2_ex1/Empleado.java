package n2_ex1;

public class Empleado {
	private String nombre;
	private int codigo_emp;
	
	public Empleado(String nombre, int codigo) {
		this.nombre = nombre;
		this.codigo_emp = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getLongitud() {
		return nombre.length();
	}
	
	public static int sortByLongitud(Empleado nombre1, Empleado nombre2) {
		return nombre1.getLongitud()-(nombre2.getLongitud());
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", codigo: "+codigo_emp;
	}
	
	
	

}
