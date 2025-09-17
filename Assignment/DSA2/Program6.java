import java.util.*;

class Demo{

	static int array(int[] arr){
	int max1 = arr[0];
	int max2 = arr[0];
	for(int i =1;i<arr.length;i++){
	
		if(arr[i]>max1){
		 max1 = arr[i];
		}
	}

	for(int i=0;i< arr.length;i++){

                if(arr[i]!=max1){
                 if(max2 == max1 || arr[i]>max2){
			 max2=arr[i];
                }

		}


        }
	System.out.println("Second Largest Number :"+max2);

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
