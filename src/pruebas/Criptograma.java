package pruebas;

public class Criptograma {

	static String fraseReal = "";
	static String codificada ="";
			
	
	public static boolean sonIguales() {
		boolean iguales = false;
		
		String realSinEspacios = fraseReal.replace(" ", "");
		String codifSinEspacios = codificada.replace(" ", "");
		
		iguales = realSinEspacios.equals(codifSinEspacios);
		
		return iguales;
	}
}
