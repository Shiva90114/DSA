// Recursion
// Code - 7

import java.util.*;
class ArrayDemo{
	static int smallNum(int[] arr){
	int small =arr[0];
	int i =0;
	while(i<arr.length){
                if(small>arr[i]){
		    small = arr[i];
		}
               i++;
	  }
	
	return small;
	}
	


	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

	 System.out.println("Enter Element of Array : ");
	 for(int i =0;i<size;i++){
	 
	 
		 arr[i] = sc.nextInt();
	 }
         System.out.println("Element of Array : ");                                                                                           
	 for(int i =0;i<size;i++){                                                                                                                       
		 System.out.print(arr[i]+" ");    
	 }
           System.out.println();
        System.out.println("Small Element of the  Array is "+smallNum(arr));
        
	sc.close();
	}
}
