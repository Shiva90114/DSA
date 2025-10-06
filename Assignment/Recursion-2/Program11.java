// Recursion -2
// Code - 11
// String Reverse

import java.util.*;

class StringDemo{
	static String stringRev(String str){
		String rev = "";
		for(int i =str.length()-1;i>=0;i--){
		rev = rev+str.charAt(i);
		}
	       return rev;
         }

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter String : ");
        String str = sc.nextLine();
	
	System.out.println("String : "+str);
	 System.out.println("Step - 1(without use otherString)");
	System.out.print("Reverse String : ");
         for(int i =str.length()-1;i>=0;i--){
           System.out.print(str.charAt(i));      
          }
	 System.out.println();
	  System.out.println("Step - 2(with use otherString)");
    
         System.out.println("Reverse String : "+stringRev(str));



	}

}
