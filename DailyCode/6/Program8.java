// Basic Array Problems
//Code - 8
//Count Negative ,Positive and Zero Element in Array 

import java.util.*;
class ArrayDemo{
	void countNum(int[] arr){
	int neg= 0,posi=0,zero=0;
	for(int i=0;i<arr.length;i++){
	         if(arr[i]>0){
			posi++;
		 }else if(arr[i]<0){
		 
	              neg++;
		 }else{
		      zero++;
		 }
	}
         	 System.out.println("Total Positive Number :"+posi);
		 System.out.println("Total Negative Number :"+neg);
		 System.out.println("Total Zero Number :"+zero);
	
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

