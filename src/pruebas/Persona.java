package pruebas;

public class Persona {
	private String nombre;
	private int edad;
	private double altura;
	private static String diaSemana = "Viernes";
	
	
	public Persona(String nombre, int edad, double altura) {
		super();
		if(nombre != null && !nombre.equals(""))
			this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		if (edad >= 0 && edad <= 200) {
			this.edad = edad;
		}
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		if(altura>0 && altura < 3.0)
			this.altura = altura;
	}


	public String getDiaSemana() {
		return diaSemana;
	}
	
	void cumplirAños() {
		edad++;
	}
	
	void crecer(double incremento) {
		altura+=incremento;
		
	}
	
	static void metodo() {
		int edad;
		edad = 8;
		diaSemana = "Sábado";
	}
}
