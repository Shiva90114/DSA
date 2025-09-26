// Using for loop
// Sum of Number
import java.util.*;
class SumOfNum{
	static int sum(int num){
	int sum =0;
	for(int i=1;i<=num;i++){
	
		sum=sum+i;
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
