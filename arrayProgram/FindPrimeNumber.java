package arrayProgram;

public class FindPrimeNumber {

	public static void main(String[] args) {
		int arr[] = {7,12,3,11,54,33,22,11,55,63,1,19,27,43	};
		int count = 0;
		 
		for(int i =0 ; i < arr.length; i++) {
		 if (arr[i] % 2 == 0) {
			 
			 count ++;
		 }
	}
		 System.out.println("Number which are Prime number : " + count);
	}
}
