// Recursion
// Code - 4

import java.util.*;
class ArrayDemo{
	static float aveNum(int[] arr){
	
		if(arr == null || arr.length == 0){
		return 0.0f;
                } 
	
	int sum =sumArr(arr,0);
	return (float)sum/arr.length;
	}
	static int sumArr(int[] arr,int index){
	if(index == arr.length){
		return 0;
	}
	return arr[index]+sumArr(arr,index+1);
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
	   float average= aveNum(arr);
        System.out.println("Average of All Element of Array is "+average);
        
	sc.close();
	}
}
