package ejercicios.crud.ejercicio01;

public class Alumno {

	private String nombre="";
	private double notaMedia=1.0;
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre, double notaMedia) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if(notaMedia>=1 && notaMedia<=10) {
			this.notaMedia = notaMedia;
		}
	}

	public String getNombre() {
		return this.nombre;
	}

	public double getNotaMedia() {
		return this.notaMedia;
	}
	
	public void setNotaMedia(double notaMedia) {
		if(notaMedia>=1 && notaMedia<=10) {
			this.notaMedia = notaMedia;
		}
	}

	@Override
	public String toString() {
		return this.nombre + ": " + this.notaMedia;
	}
	
}
