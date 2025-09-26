// Using While loop

// Factorial of  N Number
import java.util.*;
class Factorial{

	static int fact(int n){
	int fact =1,i=1;
	while(i<=n){
	
		fact=fact*i;
		i++;
	}
        return fact;
	}
	public static void main(String[] args){
	        Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Number = ");
		int n =sc.nextInt();
		System.out.println("Factorial of  "+n+" is = "+fact(n));
	}
}
