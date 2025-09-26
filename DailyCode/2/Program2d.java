// Using recursion
// Sum of Number
import java.util.*;
class SumOfNum{
	static int sum(int num){
	int sum =0,i=1;
	if(num<=0)
		return 0;
	return num+sum(num-1);
	}

	public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number ");
		int num = sc.nextInt();

		System.out.println("Sum of Number is "+sum(num));
	}
}
