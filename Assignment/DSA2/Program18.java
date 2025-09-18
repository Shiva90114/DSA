import java.util.*;

class ArrayMax{

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter number of rows :");
	 int rows = sc.nextInt();
	 System.out.println("Enter number of Columns :");
         int cols = sc.nextInt();
	
	 int[][] a =new int[rows][cols];
	 int[][] b =new int[rows][cols];
	System.out.println("Enter 2D Array Element of Array 'A' : ");
	for(int i=0;i<rows;i++){
	      for(int j=0;j<cols;j++){
		
			a[i][j] = sc.nextInt();
		}
	}
	

	System.out.println("Enter 2D Array Element of Array 'B' :");
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			b[i][j] = sc.nextInt();
	}
	}
	boolean equal = true;
	for(int i=0;i<rows;i++){
	
		
		for(int j = 0;j< cols;j++){
			if(a[i][j] != b[i][j]){
		equal= false;
		break;
		}
		}
		if(!equal) break;
	}
	if(equal){
	
		System.out.println("Both Matrix is Same");
	} else{

	System.out.println("Both Matrix is Different ");
	}
}
}
