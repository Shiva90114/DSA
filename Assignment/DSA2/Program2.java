import java.util.*;

class Demo{

	static double array(int[] arr){
	int sum = 0;
	for(int num : arr){
	
		sum = sum+num;
		
		}
	
	double avg = (double)sum/arr.length;
        System.out.println("Number Averge of Array Element :"+avg);
	
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
