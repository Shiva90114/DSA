// Recursion
// Code - 5

import java.util.*;
class Recursion{

	static int  sum(int num){
	int sum =0;
	
	while(num>0){
            int digit = num%10;
	    if(num%2!=0){	
		    sum = sum + digit*digit;
	       }
	      num = num/10;
	}
	return sum;
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	int num = sc.nextInt();

	System.out.println("Sum of Square of odd Digit is "+sum(num));

	}
}
