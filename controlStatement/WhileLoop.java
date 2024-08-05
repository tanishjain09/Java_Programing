package controlStatement;

public class WhileLoop {
	public static void main(String[] args) {
		
		System.out.println("From Main");
		
		int a = 10; //Initializaion
		int b = 20;
		
		while(a < b) { //condition
			System.out.println("Kya? Haal hai Bhai log!!!");
			a++; //updation
		}
		System.out.println("End of Main");
	}
}

