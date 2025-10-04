// Recursion
// Code - 3

import java.util.*;
class Recursion{

	static int  count(int num){
	int count =0;
	int i=1;
	while(i*i<=num){

	if(num%i==0){	
		if(num==i*i){
			count++;
		}else{
		       count= count+2;
		}
	   }
	      i++;
	}
	return count;
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	int num = sc.nextInt();

	System.out.println("Count of Factor of "+num+" is "+count(num));

	}
}
