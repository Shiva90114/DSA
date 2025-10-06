// Recursion
// Code - 6

import java.util.*;
class ArrayDemo{
	static int largeNum(int[] arr,int index){
	if(index == arr.length-1){
	  return arr[index];
	}
	int maxValue = largeNum(arr,index+1);
	if(arr[index]>maxValue){
	return arr[index];
	} else{
	return maxValue;
	}
	
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
        System.out.println("Large Element of the  Array is "+largeNum(arr,0));
        
	sc.close();
	}
}
