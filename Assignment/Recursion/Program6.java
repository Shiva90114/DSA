// Using Recursion

// Number of Digits in the Number
import java.util.*;
class CountDigits{

	static int count(int n){
	
	if(n==0)
		return 0;
        return 1+count(n/10);
	}
	public static void main(String[] args){
	        Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Number = ");
		int n =sc.nextInt();
		System.out.println("The Count  of Digit  is = "+count(n));
	}
}
