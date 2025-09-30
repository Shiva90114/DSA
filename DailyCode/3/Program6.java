// Recursion
// Code - 6

import java.util.*;
class PrintNum{

	static void printNum(int i,int num){
	     if(i>num)
		     return;

             System.out.println(i);
	     printNum(i+1,num);
	
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	int num = sc.nextInt();

	System.out.println("Print Number 1 to "+num+" is ");
	printNum(1,num);
	
	}
}
