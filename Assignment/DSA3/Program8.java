import java.util.*;

class Array2DOddCube{
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number of Rows : ");
	int rows = sc.nextInt();
	System.out.println("Enter number of Columns : ");
        int cols = sc.nextInt();
	int[][] arr = new int[rows][cols];
	System.out.println("Enter Element of Array : ");
        
	for(int i=0;i<rows;i++){
	     for(int j=0;j<cols;j++){
		arr[i][j] = sc.nextInt();
	     }
	}
	

        System.out.println("Element Which have Cube is  Odd Number  :  ");
        
	for(int i =0;i<rows;i++){
	
		for(int j=0;j< cols;j++){
		int num = arr[i][j];
		if(num%2!=0){
		System.out.println(num+" ");
		 }
		}
	
	}
	}
}
