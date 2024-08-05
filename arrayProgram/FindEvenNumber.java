package arrayProgram;

public class FindEvenNumber {

	public static void main(String[] args) {
		int arr [] = {20,5,7,12,15,66,77,43,1,69};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
