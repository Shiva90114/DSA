import java.util.*;
class Demo{
	static int count(int x){
	
        int count =0;	
	for(int i =1;i<=x;i++){
	          
		  count=count+i;
		  }
      	return count;
         	
	}
            public static void main(String[] args){
         	Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		int num= sc.nextInt();

	
		System.out.println(count(num));
			}
}

