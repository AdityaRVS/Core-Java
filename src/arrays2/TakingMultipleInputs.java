package arrays2;

import java.util.Scanner;

public class TakingMultipleInputs {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int sc1= sc.nextInt();
		
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		
		System.out.println("Sum of 2 numbers:"+ (sc1 +num2));
	}

}
