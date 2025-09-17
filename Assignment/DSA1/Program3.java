import java.util.*;

class Demo{

	static int digit(int x){
	String str = String.valueOf(x);
	System.out.println("Digit of "+x+" : ");
	
	for(int i =0;i<str.length();i++){
	
		System.out.println(str.charAt(i));
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
