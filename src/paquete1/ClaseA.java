package paquete1;

import paquete1.paquete2.ClaseB;

public class ClaseA {
	String nombre;
	private int edad;
	
	public static void main(String[] args) {
		ClaseB b = new ClaseB();
		String n = b.nombre;
	}
	
	
}

class ClaseD {
	public static void main(String[] args) {
		ClaseA a = new ClaseA();
		String n = a.nombre;
	}
}