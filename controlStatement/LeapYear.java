package controlStatement;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year = sc.nextInt();
		
		if(year % 400 == 0){
			System.out.println("Given Year is Leap year");
		}else if((year % 100 != 0 && year % 4 == 0)) {
			System.out.println("Given Year is Leap year");
		}
		else {
			System.out.println("Give Year is not Leap year");
		}
		
		//year % 4 == 0 year must be divided by 4
		//year % 100 != 0 year is not an century year(not divisible by 100)
		//year % 400 == 0 year is an Century year (divisible by 100)
		//and must be divided by 400
	}
}
