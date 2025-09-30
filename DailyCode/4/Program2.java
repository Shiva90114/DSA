// Count of Number
// Code 2

import java.util.*;
class CountNum{

	static int countNum(int x,int y){
	int count =y-x+1;
	return count;
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter 1st Number : ");
	int num1 = sc.nextInt();
	System.out.println("Enter 2nd Number : ");                                                                                                                  int num2 = sc.nextInt();
	
	int result=countNum(num1,num2);
	System.out.println("Total  Number in "+num1+" and "+num2+" is "+result);
	
	}
}
