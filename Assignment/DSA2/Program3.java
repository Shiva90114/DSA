import java.util.*;

class Demo{

	static int array(int[] arr){
	int positive = 0;
	int negative = 0;
	int zero = 0;
	for(int num : arr){
	
		if(num>0){
		positive++;
		}
		else if(num<0){
		negative++;
		}else{
		zero++;
		}

	}
	System.out.println("Total Positve Number :"+positive);
	System.out.println("Total Negative Number :"+negative);
	System.out.println("Total Zero Number :"+zero);
	
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
