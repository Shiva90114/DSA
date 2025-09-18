import java.util.*;

class ArrayMax{

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a =new int[2][2];
	
	System.out.println("Enter 2D Array Element of Array 'A' : ");
	for(int i=0;i<2;i++){
	      for(int j=0;j<2;j++){
		
			a[i][j] = sc.nextInt();
		}
	}
	

	int maxSum = Integer.MIN_VALUE;
	int maxRow = -1;

	for(int i=0;i<2;i++){
		int rowSum = 0;
		for(int j=0;j<2;j++){
			
			rowSum +=a[i][j];
	}


	if(rowSum > maxSum){
	
		maxSum = rowSum;
		maxRow =i;
	}

	}

	System.out.println("Row "+(maxRow+1)+" has Maximum sum "+maxSum);
	}
}
