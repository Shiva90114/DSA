import java.util.*;

class Demo{

	static int digit(int num){
	int original = num;
	int reverse = 0;
       
        while(num!= 0){
	
		int digit = num%10;
		reverse = reverse*10 + digit;
		num = num/10;
	}
	if(original == reverse ){
	          System.out.println(original+" is Palindrome");
	}else {
	 
		System.out.println(original +" is Not Palindrome");
	}
        return 0;	
	}

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	int num = sc.nextInt();

	System.out.println(digit(num));

	}
}
