// Recursion
// Code - 6

import java.util.*;
class Recursion{

	static int  sum(int num){
	if(num == 0)
		return 0;
	int digit = num%10;
	
	int current = (digit%2 != 0)? digit * digit :0;
	      return current +sum(num/10);
	
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	int num = sc.nextInt();

	System.out.println("Sum of Square of odd Digit is "+sum(num));

	}
}
