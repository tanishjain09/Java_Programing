package variableDataTypeOperator;
import java.util.Scanner;
public class ArithmeticOperation {
	public static void main(String[] args) {
		
		//ClassName c1 = new ClassName() -> object creation syntax
		Scanner sc = new Scanner(System.in);
		//constructor is use to intialize value to non static variable
		
		System.out.println("Enter first Number: ");	
		int num1 = sc.nextInt();
		System.out.println("Enter second Number: ");
		int num2 = sc.nextInt();
		
		//Additon
		int sum = num1 + num2;
		System.out.println("Sum: " + sum);
		
		//Substraction
		int sub = num1 - num2;
		System.out.println("Substraction: "+ sub);
		
		//Multiplication
		int multi = num1 * num2;
		System.out.println("Multiplication: "+ multi);
		
		//Devision
		if(num2 != 0) {
			int quotient = num1 / num2;
			System.out.println("Quotient: " + quotient);
		}else {
			System.out.println("Cann't divided by 0");
		}
		
		//Modulus
		if(num2 != 0) {
			int reminder = num1 % num2;
			System.out.println("Reminder: " + reminder);
		}else {
			System.out.println("Cann't divided by 0");
		}
		
	}
}
