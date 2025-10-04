// Recursion
// Code - 8

import java.util.*;
class Recursion{

	
	static int  revM(int num,int rev){
	if(num == 0)
		return rev;
	rev = rev *10+num%10;
	
	return revM(num/10,rev);
	
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	int num = sc.nextInt();

	System.out.println("Reverse the User Number  is "+revM(num,0));

	}
}
