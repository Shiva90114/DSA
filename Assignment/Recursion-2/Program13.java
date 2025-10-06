// Recursion -2
// Code - 13
// Perfect Number

import java.util.*;

class NumPerfect{
	static boolean num(int num ){
          int i =1,sum=0;
	  while(i<=num/2){
	  
		  if(num%i == 0){
		  sum=sum+i;
		  }
		  i++;
	  }
	  
	  if(sum == num){
	     return true;
	  }else{
             return false;
	    }
         }

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
        int num = sc.nextInt();
	
	if(num(num)){
             System.out.println(num+" is Perfect Number");
	}else{
	     System.out.println(num+" is not Perfect Number");
	}



	}

}
