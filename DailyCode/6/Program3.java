// Basic Array Problems
//Code - 3

import java.util.*;
class ArrayDemo{
	static int minNum(int[] arr){
	int min = arr[0];
		for(int i=0;i<arr.length;i++){
	        if(arr[i]<min){
			min = arr[i];
		
		}
	}
	return min;
	//Time  O(n)
	
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

	 System.out.println("Minimum Number of Array is "+minNum(arr));

           	}

}

