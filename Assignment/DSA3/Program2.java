import java.util.*;

class NumOddSquare{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number : ");
	int num = sc.nextInt();
	
	if(num<0){
	    num =-num;
	}
	int sum =0;
        System.out.println("Odd Digit : ");	
	while(num>0){

		int digit = num%10;
		if(digit%2!=0){
		         System.out.print(digit+" ");
			sum=sum+digit*digit;
		}
		
	
	
		num = num/10;
		
        	}

        System.out.println();
	System.out.println("Total digit : "+sum);
	}
}
