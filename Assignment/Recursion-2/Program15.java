// Recursion -2
// Code - 15
// Strong Number

import java.util.*;

class NumStrpng{
	static int fact(int num ){
		int fact =1;
		for(int i= 1;i<=num;i++){
		      fact*=i;
		}
          
		  return fact;
        }

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
        int num = sc.nextInt();
	int sum =0,temp=num;

	while(temp != 0){
	
		int digit = temp%10;
		sum = sum+fact(digit);
		temp=temp/10;
	}
	
	if(sum == num){
             System.out.println(num+" is Strong Number");
          }else{
             System.out.println(num+" is not Strong Number");
            }
         
	}

}
