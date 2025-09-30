// Recursion
// Code - 7

import java.util.*;
class SumOfNum{

	static int sum(int num){
		
		if(num ==1){
		
			return 1;
		}
		return num+sum(num-1); 
	  
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	int num = sc.nextInt();

	System.out.println("Sum of  Number 1 to "+num+" is "+sum(num));
	
	
	}
}
