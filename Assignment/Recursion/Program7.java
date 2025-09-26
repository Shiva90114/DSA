// Using While loop

// Sum of  Digits  of a Number
import java.util.*;
class SumOfDigits{

	static int sum(int n){
	int sum=0;
	while(n>0){
	
		sum+=n%10;
		n/=10;
	}
        return sum;
	}
	public static void main(String[] args){
	        Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Number = ");
		int n =sc.nextInt();
		System.out.println("The Sum of Digit is = "+sum(n));
	}
}
