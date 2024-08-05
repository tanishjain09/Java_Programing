package arrayProgram;

public class LargestNumber {
	public static void main(String[] args) {
		
		int arr[] = {20,32,69,77,56,3,1,45,6,8,9,22,54};
		int sa = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>sa)
				sa = arr[i];
		}
				System.out.println(sa);
			
		}
	}



