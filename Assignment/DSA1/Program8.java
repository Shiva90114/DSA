import java.util.*;

class Fibonacci{

	static int  digit(int num){
	int first =0,second = 1;
	System.out.println("Fibonacci Series : ");
        for(int i=1;i<= num;i++){
	
		System.out.println(first);
		int next = first + second;
		first = second;
		second= next;
		
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
