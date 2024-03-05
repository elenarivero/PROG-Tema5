package ejerciosp1.ejercicio01;

/**
 * Clase que va a definir las propiedades y los métodos de una cuenta corriente
 */
public class CuentaCorriente {
	private String dni = "";
	private String nombre = "";
	private double saldo;

	public CuentaCorriente(String dni, double saldo) {
		if (dni != null && !dni.equals("")) {
			this.dni = dni;
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	public CuentaCorriente(String dni, String nombre, double saldo) {
		this(dni, saldo);
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean sacarDinero(double dinero) {
		boolean transaccion = false;

		if (this.saldo >= dinero) {
			this.saldo -= dinero;
			transaccion = true;
		}

		return transaccion;
	}

	public void ingresarDinero(double dinero) {
		if (dinero > 0) {
			this.saldo += dinero;
		}
	}

	public void mostrarInformacion() {
		System.out.println("Titular: " + this.nombre);
		System.out.println("DNI: " + this.dni);
		System.out.println("Saldo: " + this.saldo);
	}

	public String toString() {
		String cadena = "";

		cadena += "------------------------------\n";
		cadena += "Titular: " + this.nombre + "\n";
		cadena += "DNI: " + this.dni + "\n";
		cadena += "Saldo: " + this.saldo + "\n";
		cadena += "------------------------------";
		
		return cadena;
	}
	

	public boolean equals(CuentaCorriente c) {
		boolean sonIguales = false;

		if (this.dni.equals(c.dni)) {
			sonIguales = true;
		}

		return sonIguales;
	}

}
