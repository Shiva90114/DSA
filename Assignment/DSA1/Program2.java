import java.util.*;

class Demo{

	static int countFactor(int x){
        if(x<=0){
        System.out.println("Plaese Enter Positive Number or grater than 0 ");
         return 0;
        }

	int count=0;
	for(int i=1;i<=x;i++){
	
		if(x%i==0){
          		System.out.println(i);
			count++;

		}	
	}
return 0;
	}
	public static void main(String[]  args){
	Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number");
			int num = sc.nextInt();

			System.out.println(num+" Factor is ");
	         	System.out.println(countFactor(num));
	}
}
