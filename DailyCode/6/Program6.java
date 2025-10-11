// Basic Array Problems
//Code - 6
//Product of Array Element

import java.util.*;
class ArrayDemo{
	static int productNum(int[] arr){
	int product = 1;
		for(int i=0;i<arr.length;i++){
	        
			product=product*arr[i];
		
		
	}
	return product;
	
	
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

	 System.out.println("Average of Array Element  is "+productNum(arr));

           	}

}

