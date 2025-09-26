// Using Recursion

// Sum of 1st  N natural Number
import java.util.*;
class SumNatural{

	static int sum(int n){
	
		if(n==0)
			return 0;
		return n+sum(n-1);
	}
   
	public static void main(String[] args){
	        Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Number = ");
		int n =sc.nextInt();
		System.out.println("Sum of 1st "+n+" numbers = "+sum(n));
	}
}
