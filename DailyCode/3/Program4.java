// Count of Factor
// code - 4

import java.util.*;
class CountNum{

	static int countFactor(int num){
	
		int count = 0;
		for(int i =1;i*i<=num;i++){
		
			if(num%i==0){
			if(i*i==num){
				count++;
			}else{
			     count = count+2;
			}
			}
		}
		return count;
	
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	int num = sc.nextInt();

	System.out.println("Total Factor count of "+num+" is "+countFactor(num));
	
	}
}
