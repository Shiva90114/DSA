import java.util.*;

class ArraySum{

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a =new int[2][2];
	

	System.out.println("Enter 2D Array Element of Array 'A' : ");
	for(int i=0;i<2;i++){
	
		for(int j=0;j<2;j++){
		
			a[i][j] = sc.nextInt();
		}
	}
	

	System.out.println("Sum of Rows ");

	for(int i=0;i<2;i++){
		int sum =0;
		for(int j=0;j<2;j++){
			System.out.print(a[i][j]+"\t");
		sum+= a[i][j];
	}
	System.out.println("| "+sum);
	}



	}
}
