// Reverse String using Stack

import java.util.*;

class ReverseString {

	String revString(String str) {
	
		Stack<Character> s = new Stack<Character>();

		for(int i =0;i<str.length();i++) {
	
			s.push(str.charAt(i));

		}
	
	 System.out.println(s);
	 return "Hello";
	}
	

}

class Client {

	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String to Reverse");
		String str = sc.next();

		ReverseString obj =new ReverseString();
		String rev = obj.revString(str);

		System.out.println(rev);

	}
}
