// Using While loop

// Sum of 1st  N natural Number
import java.util.*;
class SumNatural{

	static int sum(int n){
	int sum =0,i=1;
	while(i<=n){
	
		sum=sum+i;
		i++;
	}
        return sum;
	}
	public static void main(String[] args){
	        Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Number = ");
		int n =sc.nextInt();
		System.out.println("Sum of 1st "+n+" numbers = "+sum(n));
	}
}
