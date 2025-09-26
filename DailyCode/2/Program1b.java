// Count Factor 
// code- 2

import java.util.*;

class CountFactor{

	static int countFactor(int num){
	
		int count =0;
		for(int i=1;i<=num/2;i++){
		
			if(num%i==0){
			count++;
			}
		}
		return count+1;
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	int num = sc.nextInt();
	System.out.println("Total Factor is "+countFactor(num));
	}
}
