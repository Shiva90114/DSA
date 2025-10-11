// Basic Array Problems
//Code - 5

import java.util.*;
class ArrayDemo{
	static double aveNum(int[] arr){
	int sum = 0;
		for(int i=0;i<arr.length;i++){
	        
			sum=sum+arr[i];
		
		
	}
	return (double)sum/arr.length;
	
	
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

	 System.out.println("Average of Array Element  is "+aveNum(arr));

           	}

}

