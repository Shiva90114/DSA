import java.util.*;
class Demo{
	static int countFactor(int x){
	
	if(x <= 0){
	System.out.println("Enter Positive Number or Greater than Zero");
	return 0;
	}
        else{
	
	int count =0;
	for(int i =1;i<=x;i++){
	          if(x%i==0){
		  count++;
		  } 
	       }
		  return count;
         	}
	}



	public static void main(String[] args){
	
	
		Scanner sc = new Scanner(System.in);

	
		System.out.println("Enter Number : ");
	
		int num= sc.nextInt();

	
		System.out.println(num+"  Factor Count is "+countFactor(num));
	}
}

