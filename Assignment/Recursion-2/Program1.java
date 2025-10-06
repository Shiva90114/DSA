// REcursion
// Code - 1

import java.util.*;
class ArrayDemo{
	static int evenNum(int[] arr){
	int count =0;
	int i =0;
	while(i<arr.length){
                if(arr[i]%2 == 0){
		      count++;
		}
               i++;
	  }
	return count;
	}
	static int oddNum(int[] arr){
        int count =0;
        int i =0;
        while(i<arr.length){
                if(arr[i]%2 != 0){
                      count++;
                }
               i++;
          }
        return count;
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
        System.out.println("Total Even Number in Array is "+evenNum(arr));
        System.out.println("Total Odd Number in Array is "+oddNum(arr));	
	sc.close();
	}
}
