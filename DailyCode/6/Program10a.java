// Basic Array Problems
//Code - 10a
//Consecutive Number 

import java.util.*;
class ArrayDemo{
	static int  conNum(int[] arr){
	
	for(int i=0; i<arr.length-1;i++){
	        if(arr[i]== arr[i+1]){
		return arr[i];
		}
	}
	return -1;
         
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
	int cons = conNum(arr);
        if(cons != -1){
        
	System.out.println("Consecutive Element of Array is : "+cons);

        }else{
		System.out.println("No Consecutive Element of Array");
                }
	
      	}

}

