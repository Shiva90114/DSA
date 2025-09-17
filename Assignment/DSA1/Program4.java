import java.util.*;

class Demo{

	static int  digit(double x){
	double r = Math.sqrt(x);

	System.out.println(r);
        return 0;	
	}

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	double num = sc.nextDouble();

	System.out.println(digit(num));

	}
}
