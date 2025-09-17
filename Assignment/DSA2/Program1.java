import java.util.*;

class Demo{

	static int array(int[] arr){
	System.out.println("Even number");
	int even = 0;
	for(int num : arr){
	
		if(num%2==0){
		System.out.println(num);
		even++;
		}
	}
	System.out.println("Total Even Number :"+even);
	System.out.println("Odd number");
	int odd = 0;
	for(int  num : arr){

		if(num%2!=0){
                System.out.println(num);
		odd++;

                }
	
	 }
	System.out.println("Total Odd Number :"+odd);
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
