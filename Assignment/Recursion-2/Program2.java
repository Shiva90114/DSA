// REcursion
// Code - 2

import java.util.*;
class ArrayDemo{
	static int evenNum(int[] arr,int index){
		if(index>= arr.length){
		
			return 0;
		}
	        int count = (arr[index]%2== 0) ? 1:0;
	return count+evenNum(arr,index+1);
	}
	static int oddNum(int[] arr,int index){
                if(index>= arr.length){

                        return 0;
                }
                int count = (arr[index]%2!= 0)?1:0;
        
        return count+oddNum(arr,index+1);
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
        System.out.println("Total Even Number in Array is "+evenNum(arr,0));
        System.out.println("Total Odd Number in Array is "+oddNum(arr,0));	
	sc.close();
	}
}
