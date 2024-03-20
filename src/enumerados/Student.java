package enumerados;

public class Student {
	enum Level {LOW, MEDIUM, HIGH};
	
	Level nivel;
	Meses mes;
	
	public Student(String nivel) {
		this.nivel = Level.valueOf(nivel.toUpperCase());
	}
	
	public Student(Level nivel) {
		this.nivel = nivel;
	}
}
