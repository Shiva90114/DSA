// Using While loop
// Sum of Number
import java.util.*;
class SumOfNum{
	static int sum(int num){
	int sum =0;
	int i=1;
	while(i<=num){
	
		sum=sum+i;
		i++;
	}
	return sum;
	}

	public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number ");
		int num = sc.nextInt();

		System.out.println("Sum of Number is "+sum(num));
	}
}
