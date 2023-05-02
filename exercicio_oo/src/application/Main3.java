package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student st = new Student();
		
		System.out.println("Name: ");
		st.name = sc.nextLine();
		System.out.println("Grade1, grade2, grade3: ");
		st.grade1 = sc.nextDouble();
		st.grade2 = sc.nextDouble();
		st.grade3 = sc.nextDouble();
		
		if(st.finalGrade() > 60.0 ) {
		System.out.printf("FINAL GRADE: %.2f%n", st.finalGrade());
		System.out.println("PASS");
		}else {
			System.out.printf("FINAL GRADE: %.2f%n", st.finalGrade());
			System.out.printf("FAILED \nMISSING %.2f POINTS%n ", st.missingPoints());
		}
		sc.close();
	}

}
