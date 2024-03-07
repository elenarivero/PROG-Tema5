package ejerciciosp1.ejercicio03;

public class Punto {
	int x;
	int y;
	
	@Override
	public String toString() {
		String cadena = "(" + this.x + ", " + this.y + ")";		
		return cadena;
	}
}
