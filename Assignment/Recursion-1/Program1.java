// Recursion
// Code - 1

import java.util.*;
class Recursion{

	static int  sumOf(int num){
	int sum =0;
	while(num>0){
	
		int digit = num%10;
		if(digit%2 == 0){
		sum = sum+digit;
		}
		num =num/10;
	}
	return sum;
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	int num = sc.nextInt();

	System.out.println("Sum of Even Digit is "+sumOf(num));

	}
}
