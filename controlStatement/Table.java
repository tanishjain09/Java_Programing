package controlStatement;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		if(num < 1 || num > 30) {
			System.out.println("Invalid Number");
			return;
		}
		int i= 1;
		while(i <= num){
			System.out.println("Table of " + i + ":");
			int j = 1;
			while(j <= 10){
				System.out.println(i + " X "+ j + " = "+ i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
