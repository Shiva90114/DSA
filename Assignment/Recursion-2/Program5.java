// REcursion
// Code - 5

import java.util.*;
class ArrayDemo{
	static int largeNum(int[] arr){
	int large =arr[0];
	int i =0;
	while(i<arr.length){
                if(large<arr[i]){
		    large = arr[i];
		}
               i++;
	  }
	
	return large;
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
        System.out.println("Large Element of the  Array is "+largeNum(arr));
        
	sc.close();
	}
}
