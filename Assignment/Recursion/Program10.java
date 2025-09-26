// Using Recursion

// Check Number is Palindrome
import java.util.*;
class PalindromeNum{

	static int revNo(int n,int rev){
	if(n==0)
		return rev;

        return revNo(n/10,rev*10+(n%10));
	}
	public static void main(String[] args){
	        Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Number = ");
		int n =sc.nextInt();
		int rev = revNo(n,0);
		if(n==rev)
                        System.out.println(n+"is a Palindrome");
		else
			System.out.println(n+"is not a Palindrome");
	}
}
