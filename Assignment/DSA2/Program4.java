import java.util.*;

class Demo{

	static int array(int[] arr){
	int max = arr[0];
	for(int num : arr){
	
		if(num>max){
		 max = num;
		}
		
		

	}
	System.out.println("Largest Number :"+max);

       	return 0;
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Array Size :");
	int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter Array Element :");
        for(int i=0;i<n;i++){
	arr[i]  = sc.nextInt();

	}

	array(arr);


	}
}
