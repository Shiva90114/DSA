import java.util.*;

class DiagonalSum{

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter Size of Square Matrix :");
	 
	 int n = sc.nextInt();
	 int[][] a =new int[n][n];
	
	System.out.println("Enter 2D Array Element of Array 'A' : ");
	for(int i=0;i<n;i++){
	      for(int j=0;j<n;j++){
		
			a[i][j] = sc.nextInt();
		}
	}
	

	int firstSum =0;
	int secondSum = 0;
	

	for(int i=0;i<n;i++){
		firstSum +=a[i][i];
		secondSum +=a[i][n-1-i];
	      
		}
          System.out.println("Primary Diagonal Sum = " +firstSum);
          System.out.println("Secondary Diagonal Sum ="+secondSum);

	  int total = firstSum +secondSum;
	  if(n%2==1){
	  
		  total -=a[n/2][n/2];
	  }
	System.out.println("Total Sum of Diagonal  = "+ total);
	
      }
}
