import java.util.*;

class Demo{

	static int  digit(int x){
	int sum =0;
	for(int i =1;i<=x;i++){
	
		if(i%2==0){
		sum = sum+i;
		}
	}

        
        return sum;	
	}

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	int num = sc.nextInt();

	System.out.println(digit(num));

	}
}
