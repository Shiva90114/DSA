// Recursion -2
// Code - 16
// Strong Number

import java.util.*;

class NumStrong{
	static int fact(int num ){
	    if(num == 0 || num ==1){
	           return 1;
	    }
          
		  return num*fact(num-1);
        }
	static int sumFact(int num){
	
		if(num == 0){
			return 0;
		}
		return fact(num%10) + sumFact(num/10);
	}

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
        int num = sc.nextInt();
	
	if(sumFact(num) == num){
             System.out.println(num+" is Strong Number");
          }else{
             System.out.println(num+" is not Strong Number");
            }
         
	}

}
