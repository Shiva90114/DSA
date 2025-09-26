// Using Recursion

// Factorial of N Number
import java.util.*;
class Factorial{

	static int fact(int n){
        if(n==0)
		return 1;
	return n*fact(n-1);
	}
   
	public static void main(String[] args){
	        Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Number = ");
		int n =sc.nextInt();
		System.out.println("factorial of "+n+" is = "+fact(n));
	}
}
