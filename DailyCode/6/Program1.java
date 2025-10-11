// Basic Array Problems
//Code - 1

import java.util.*;
class ArrayDemo{
	static int searchEle(int[] arr,int find){
	//System.out.println(System.identityHashCode(arr));
		for(int i=0;i<arr.length;i++){
	        if(arr[i]==find){
		return i;
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
	System.out.println(System.identityHashCode(arr));
	//System.out.println("Enter Find Element  : ");
	int find = sc.nextInt();
	int res = searchEle(arr,find);
	if(res != -1){
             System.out.println("Element is Found"); 
	}else{
	System.out.println("Element is Not Found");
	}
	}

}
// one arr is use
