// Recursion
// Code - 9

import java.util.*;
class Recursion{

	static int  rev(int num){
	
        int rev =0;	
	while(num>0){
            
		    int digit = num%10;
		    rev = rev * 10 + digit; 
		    num = num/10;
	       
	      
	}
	return rev;
	}
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	int num = sc.nextInt();
        int rev =rev(num);
	if(num == rev){
	System.out.println(num+ " is  Palindrome ");
	}else{
	System.out.println(num+ " is Not Palindrome ");
	}

	}
}
