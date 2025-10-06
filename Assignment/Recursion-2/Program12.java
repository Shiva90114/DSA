// Recursion -2
// Code - 12
// String Reverse

import java.util.*;

class StringDemo{
	static String stringRev(String str){
		if(str == null || str.length() <= 1){
		return str;
		}

		
	       return stringRev(str.substring(1))+str.charAt(0);
         }

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter String : ");
        String str = sc.nextLine();
	
	System.out.println("String : "+str);

	String rev = stringRev(str);
        System.out.println("Reverse String : "+rev);
	}

}
