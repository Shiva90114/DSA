import java.util.*;

class NumStrong{

	static int factorial(int n){
		int fact =1;
		while(n>0){
		fact=fact*n;
		n--;
		}
		return fact;
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number : ");
	int num = sc.nextInt();
	int temp = num;
	int sum =0;

	while(temp>0){
		int digit = temp%10;
		sum= sum+factorial(digit);
		temp=temp/10;
	}
	if(sum ==num){

        System.out.println(num+" is Strong Number : ");
        } else{
	System.out.println(num+" is not Strong Number : ");
	}
	
        
	}
}
