// Basic Array Problems
//Code - 4

import java.util.*;
class ArrayDemo{
	static int sumNum(int[] arr){
	int sum = 0;
		for(int i=0;i<arr.length;i++){
	        
			sum=sum+arr[i];
		
		
	}
	return sum;
	
	
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

	 System.out.println("Sum of Number of Array is "+sumNum(arr));

           	}

}

