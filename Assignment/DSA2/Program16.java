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
	

	int[] colSum = new int[2];

	for(int i=0;i<2;i++){
		
		for(int j=0;j<2;j++){
			System.out.print(a[i][j]+"\t");
			colSum[j] +=a[i][j];
	}

	System.out.println();

	}

	System.out.println("Sum of Column : ");
	for(int j=0;j<2;j++){
	
		System.out.print(colSum[j]+"\t");
	}


	 System.out.println();
	}
}
