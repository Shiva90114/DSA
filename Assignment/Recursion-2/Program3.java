// REcursion
// Code - 3

import java.util.*;
class ArrayDemo{
	static float aveNum(int[] arr){
	int sum =0;
	int i =0;
	while(i<arr.length){
                sum = sum+arr[i];
               i++;
	  }
	float ave = (float)sum/arr.length;
	return ave;
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
        System.out.println("Average of All Element of Array is "+aveNum(arr));
        
	sc.close();
	}
}
