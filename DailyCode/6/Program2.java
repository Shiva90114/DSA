// Basic Array Problems
//Code - 2

import java.util.*;
class ArrayDemo{
	static int maxNum(int[] arr){
	int max = arr[0];
		for(int i=0;i<arr.length;i++){
	        if(arr[i]>max){
			max = arr[i];
		
		}
	}
	return max;
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

	 System.out.println("Maximum Number of Array is "+maxNum(arr));

           	}

}

