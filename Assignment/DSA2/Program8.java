import java.util.*;

class Demo{

	static boolean sortArray(int[] arr){
	for(int i =0;i<arr.length-1;i++){
	
		if(arr[i]>arr[i+1]){
		
			return false;
		}

	}
	return true;
	
	}
	public static void main(String[] args){
	
	Scanner  sc = new Scanner(System.in);
        
	System.out.println("Enter Size of Array : ");
	int n = sc.nextInt();
	int[] arr = new int[n];

	System.out.println("Enter  Array : ");                                   
	for(int i=0;i<n;i++){
	
		arr[i] = sc.nextInt();
	}
	if(sortArray(arr)){
	
	
	System.out.println("Array is Sorted");

	}else{
	
	System.out.println("Array is Not Sorted");
	}
}
}
