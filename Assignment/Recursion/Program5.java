// Using While loop

// Number of Digits in the Number
import java.util.*;
class CountDigits{

	static int count(int n){
	int count=0;
	while(n>0){
	
		count++;
		n/=10;
	}
        return count;
	}
	public static void main(String[] args){
	        Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Number = ");
		int n =sc.nextInt();
		System.out.println("The Count  of Digit is = "+count(n));
	}
}
