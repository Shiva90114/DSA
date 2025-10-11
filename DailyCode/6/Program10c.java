// Basic Array Problems
//Code - 10c
//Consecutive Number 
// use Boolean Flag
import java.util.*;
class ArrayDemo{
	static void  conNum(int[] arr){
	boolean found =false;
	for(int i=0; i<arr.length-1;i++){
	        if(arr[i] == arr[i+1]){
		System.out.println("Consecutive Element of Array is : "+arr[i]);
		found = true;
		break;
		}
	}
	if(!found){
	          System.out.println("No Consecutive Element of Array");
         
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
	
	conNum(arr);
	
       
	
      	}

}

