package enumerados;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nivel;
		Scanner sc = new Scanner(System.in);
		
		Student s1;
		Student s2;
		
		nivel = sc.next();
		
		s1 = new Student(nivel);
		s2 = new Student(Student.Level.valueOf(nivel));
		
		System.out.println(s1.nivel);
		System.out.println(s2.nivel);
		
		sc.close();
	}

}
