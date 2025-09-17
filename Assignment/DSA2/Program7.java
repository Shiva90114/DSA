import java.util.*;

class Demo{

	static String reverse(String str){
	
       String rev="";
       for(int i= str.length()-1;i>=0;i--){
       
	       rev = rev + str.charAt(i);
       }


       System.out.println("String Original :"+str);
       System.out.println("String Reverse :");

       	return rev;
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter String :");
	String str = sc.next();
	System.out.println(reverse(str));
  }
}
