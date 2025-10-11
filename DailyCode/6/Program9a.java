// Basic Array Problems
//Code - 9
//Reverse Array 

import java.util.*;
class ArrayDemo{
	int[] revNum(int[] arr){
	int j=0;
	int[] arr2=new int[arr.length];

	for(int i=arr.length-1;i>=0;i--){
	         arr2[j] = arr[i];
		 j++;
	}
         return arr2; 
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
        ArrayDemo obj = new ArrayDemo();
	int[] reversed =obj.revNum(arr);
	System.out.println("Reverse Array : ");
        for(int i =0;i<reversed.length;i++){

                System.out.print(reversed[i]+" ");
        }
        System.out.println();	

      	}

}

