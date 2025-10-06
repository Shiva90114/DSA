// Recursion -2
// Code - 10
// Array Reverse

import java.util.*;

class ArrayDemo{
	static void rev(int[] arr,int start,int end){
	
	if(start>=end){
		return;
	}
        
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
	        rev(arr,start +1,end-1);	
        	
	}
        public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number of Element in Array : ");
	int n = sc.nextInt();
	int[] arr = new int[n];

	System.out.println("Enter  Element of Array : ");
	for(int i =0;i<n;i++){
	
		arr[i]=sc.nextInt();

	}
	System.out.println("Array : ");
        for(int i =0;i<n;i++){
		

                System.out.print(arr[i]+" ");

        }
	 System.out.println();
	 rev(arr,0,arr.length-1);
         System.out.println("Reverse Array : "+Arrays.toString(arr));



	}

}
