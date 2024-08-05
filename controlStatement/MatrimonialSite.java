package controlStatement;

import java.util.Scanner;

public class MatrimonialSite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age: ");
		int age = sc.nextInt();
		if(age >= 18 && age <= 30 ) {
			System.out.println("Your Match is Found");
		}else if (age >=31 && age<= 45) {
			System.out.println("Hard...! But you have Still HOPE.. :)");
		}else if(age >= 46) {
			System.out.println("Better luck for next life");
		}else {
			System.out.println("First grow and then come");
		}

	}

}
