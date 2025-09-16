import java.util.*;
class Demo{
	static int countFactor(int x){
	
	if(x <= 0){
	System.out.println("Enter Positive Number or Greater than Zero");
	return 0;
	}
        else{
	
	int count =0;
	for(int i =1;i<=x/2;i++){
	          if(x%i==0){
		  count++;
		  } 
	       }
		
      	
         	
	if(count<=2){
	
		System.out.println("Number  is Prime");
	}else{
	 System.out.println("Number  is not Prime");
	}
	}
return 0;

	}

	public static void main(String[] args){
	
	
		Scanner sc = new Scanner(System.in);

	
		System.out.println("Enter Number : ");
	
		int num= sc.nextInt();

	
		System.out.println(countFactor(num));
	}
}


