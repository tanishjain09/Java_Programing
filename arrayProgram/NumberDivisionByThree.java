package arrayProgram;

public class NumberDivisionByThree {

	public static void main(String[] args) {
int arr [] = {20,5,7,12,15,66,77,43,1,69};
		
int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 3==0) {
			count ++;
			}
		}
		System.out.println("NUmber which are divisible by three : " + count);
	}

}
