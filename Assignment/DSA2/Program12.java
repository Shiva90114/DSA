import java.util.*;


class StringPalindrome{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter String : ");
	String str = sc.next();
	String reverse = "";

	for(int i =str.length()-1;i>=0;i--){
		reverse +=str.charAt(i);

	}
	if(str.equals(reverse)){
	
		System.out.println(str+" is Palindrome");

	}else{
	       System.out.println(str+" is not  Palindrome");
        	}
	}
}
