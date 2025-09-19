import java.util.*;

class ArrayComposite{

	static boolean isComp(int n){
	if(n<=1) return false;
	
	for(int i=2;i<=Math.sqrt(n);i++){
	
		if(n%i==0) return true;
	}
	return false;
	}
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Size of Array :");
	int n =sc.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter Element of Array :");
  
	for(int i =0;i<n;i++){
		arr[i] = sc.nextInt();
	}
	int count =0;
         for(int i =0;i<n;i++){
		 if(isComp(arr[i])){
		 count++;
		 }
	 }
	 int[] compArray = new int[count];
	 int index=0;
	 for(int i=0;i<n;i++){
		 if(isComp(arr[i])){
			 compArray[index++] = arr[i];
		 }
	 }
		     System.out.println("Total Composite Number : "+count);
		     System.out.println("Compoite Number Array : "+Arrays.toString(compArray));
	sc.close();
	}
}
