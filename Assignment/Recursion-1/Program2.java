// Recursion
// Code - 2

import java.util.*;
class Recursion{

	static int  sumOf(int num){
	
	if(num==0){
	     return 0;
	}
	
	int digit = num%10;
	int sum =(digit%2 == 0)? digit:0;
	
		
	return sum+sumOf(num/ 10);
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	int num = sc.nextInt();
       
	System.out.println("Sum of Even Digit is "+sumOf(num));

	}
}
