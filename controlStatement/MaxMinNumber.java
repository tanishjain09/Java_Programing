package controlStatement;

import java.util.Scanner;

public class MaxMinNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Input: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the Numbers: ");
		int n2 = sc.nextInt();
		int maxNum = n2;
		int minNum = n2;
		
		int i = 1;
		while(i < n1) {
			n2 = sc.nextInt();
			if(n2 > maxNum) {
				maxNum = n2;
			}
			if(n2 < minNum) {
				minNum = n2;
			}
			i++;
		}
		System.out.println("Largest Number: "+ maxNum);
		System.out.println("Smallest Number: "+ minNum);
	} 
}
