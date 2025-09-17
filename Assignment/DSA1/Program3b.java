import java.util.*;

class Demo{

	static int digit(int num){
	Stack<Integer> stack = new Stack<>();
	while(num>0){
	
		stack.push(num%10);
		num = num/10;
	}
	System.out.println("Digit of "+num);
	while(!stack.isEmpty()){
	System.out.println(stack.pop());
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
