// Recursion -2
// Code - 14
// Perfect Number

import java.util.*;

class NumPerfect{
	static int sum(int num,int i ){
          if(i==0)
		  return 0;
	  if(num% i == 0)
		  return i+sum(num,i-1);
          else
		  return sum(num,i-1);
        }

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
        int num = sc.nextInt();
	
	int sum = sum(num,num/2);
	if(sum == num){
             System.out.println(num+" is Perfect Number");
          }else{
             System.out.println(num+" is not Perfect Number");
            }
         
	}

}
