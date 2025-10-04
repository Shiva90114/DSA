// Recursion
// Code - 4

import java.util.*;
class Recursion{

	static int  countFact(int num,int i){
 
	if(i*i>num){
	
		return 0;
	}
	
	if(num%i==0){	
		if(num==i*i){
		        return 1+countFact(num,i+1);
		}else{
		        return 2+countFact(num,i+1);
		}
	   }
	     
	
	return countFact(num,i+1);
	
	}
	static int countFact(int num){
	
		return countFact(num,1);
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	int num = sc.nextInt();

	System.out.println("Count of Factor of "+num+" is "+countFact(num,1));

	}
}
