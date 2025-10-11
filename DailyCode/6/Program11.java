// Basic Array Problems
//Code - 11
//Palindrom Count

import java.util.*;
class ArrayDemo{
	static boolean isPal(int num){
		if(num>=0 && num<10){
		return true;
		}
	int orig = num;
	int reverse = 0;
	int remainder;
	while(num>0){
	remainder = num%10;
	reverse =(reverse*10)+remainder;
	num = num/10;
	}
	return orig == reverse;
	
	}

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Size of Array : ");
	int size = sc.nextInt();
	int[] arr =new int[size];
        System.out.println("Enter Array Element : ");
	for(int i =0;i<size;i++){
	       
		arr[i]= sc.nextInt();
	}

	int count = 0;
	for(int i =0;i<arr.length;i++){
                 
		if(isPal(arr[i])){
		  count++;
		  }
	}

	System.out.println("Total Palindrome is "+count);
	
	}

}

