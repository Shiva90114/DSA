// Basic Array Problems
//Code - 9b
//Reverse Array 

import java.util.*;
class ArrayDemo{
	void revNum(int[] arr){
	int temp=0;
	for(int i=0; i<arr.length/2;i++){
	        temp =arr[i];
	        arr[i] = arr[arr.length-i-1];
		arr[arr.length-i-1] = temp;
	}
         
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
	obj.revNum(arr);
	System.out.println("Reverse Array : ");
        for(int i =0;i<arr.length;i++){

                System.out.print(arr[i]+" ");
        }
        System.out.println();	

      	}

}

