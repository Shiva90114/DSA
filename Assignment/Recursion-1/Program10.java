// Recursion
// Code - 10

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
	int rev = revM(num,0);
        if(num == rev){
	        System.out.println(num+ " is  Palindrome ");
	}else{

        	System.out.println( num+ " is Not Palindrome ");
             }
	}
}
