package controlStatement;

import java.util.Scanner;

public class StudentResult {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your CGPA: ");
		double cgpa = sc.nextDouble();
		
		if(cgpa >= 8.00 && cgpa<= 10.00) {
			System.out.println("First class with distingtion");
		}else if (cgpa >= 06.00 && cgpa<= 07.99) {
			System.out.println("First Class");
		}else if (cgpa >= 04.00 && cgpa <= 05.99){
			System.out.println("Pass");
		}else {
			System.out.println("FAIL");
		}
	}
}
