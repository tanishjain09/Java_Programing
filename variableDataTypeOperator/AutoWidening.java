package variableDataTypeOperator;

public class AutoWidening {
	
	public static void main(String[] args) {
	
		short s = 8;
		long l = s;
		
		System.out.println(l);
		
		char ch = 'A';
		int i = ch;
		
		System.out.println(i);
		
		short s1 = 12;
		float f = s1;
		System.out.println(f);
		
		boolean b = true;
		//int i1 = b; //error make the list 
		//double d = b;
		//System.out.println(i); 
	}
}
