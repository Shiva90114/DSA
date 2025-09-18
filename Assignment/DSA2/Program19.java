import java.util.*;

class ArrayMin{

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter number of rows :");
	 int rows = sc.nextInt();
	 System.out.println("Enter number of Columns :");
         int cols = sc.nextInt();
	
	 int[][] a =new int[rows][cols];
	
	System.out.println("Enter 2D Array Element of Array 'A' : ");
	for(int i=0;i<rows;i++){
	      for(int j=0;j<cols;j++){
		
			a[i][j] = sc.nextInt();
		}
	}
	

	
	int min = a[0][0];
	for(int i=0;i<rows;i++){
	       for(int j = 0;j< cols;j++){
			if(a[i][j] < min){
				min=a[i][j];
		}
		}
		
	}
	
	
		System.out.println("Smallest Element in Array = "+ min);
	
      }
}
