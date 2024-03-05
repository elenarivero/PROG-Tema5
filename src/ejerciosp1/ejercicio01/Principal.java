package ejerciosp1.ejercicio01;

public class Principal {

	public static void main(String[] args) {
		CuentaCorriente c1 = new CuentaCorriente("12345678Z", 5);
		CuentaCorriente c2 = new CuentaCorriente("11111111H", 100);
			
		c1.setNombre("Pepe");
		c1.mostrarInformacion();
		System.out.println();
		
		c1.ingresarDinero(500);
		c1.mostrarInformacion();
		
		c1.sacarDinero(200);
		c1.mostrarInformacion();
		
		if(c1.sacarDinero(400)) {
			System.out.println("Se ha sacado dinero correctamente");
		} else {
			System.out.println("No hay saldo suficiente");
		}
		
		System.out.println(c1.getSaldo());
		
//		if(c1.equals(c2)) {
//			System.out.println("Son iguales");
//		} else {
//			System.out.println("No son iguales");
//		}
		
		System.out.println(c1);
	}

}
