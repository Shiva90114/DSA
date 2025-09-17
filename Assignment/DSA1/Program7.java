import java.util.*;

class Demo{

	static int  digit(int num){
	int sum =0;
        for(int i=1;i<=num/2;i++){
	
		if(num%i==0){
		sum = sum+i;
		}
	}

	if(sum == num && num !=0){
	System.out.println("Perfect Number");
	} else{
	System.out.println("Not Perfect Number");
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
