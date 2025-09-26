// Using While loop

// Check Number is Palindrome
import java.util.*;
class PalindromeNum{

	static int revNo(int n){
	int rev=0;
	while(n>0){
	
		rev=rev*10+(n%10);
		n/=10;
	}
        return rev;
	}
	public static void main(String[] args){
	        Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Number = ");
		int n =sc.nextInt();
		int rev = revNo(n);
		if(n==rev)
                        System.out.println(n+"is a Palindrome");
                else
                        System.out.println(n+"is not a Palindrome");
	}
}
