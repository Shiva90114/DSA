// Basic Array Problems
//Code - 7
//Count Even and Odd Element in Array 

import java.util.*;
class ArrayDemo{
	void countNum(int[] arr){
	int even = 0,odd=0;
	for(int i=0;i<arr.length;i++){
	         if(arr[i]%2==0){
			even++;
		 }else{
		 
			 odd++;
		 }
	}	 System.out.println("Total Even Number :"+even);
		 System.out.println("Total Odd Number :"+odd);
		
		
	
	
	
	
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
	 obj.countNum(arr);

           	}

}

