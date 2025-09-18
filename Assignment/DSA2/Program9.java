import java.util.*;

class Demo{
	public static void main(String[] args){
	
	Scanner  sc = new Scanner(System.in);
        
	System.out.println("Enter Size of Array : ");
	int n = sc.nextInt();
	int[] arr = new int[n];
	boolean[] visited = new boolean[n];

	System.out.println("Enter  Array : ");                                   
	for(int i=0;i<n;i++){
	
		arr[i] = sc.nextInt();
	}
	System.out.println("Frequency of each Element :");
	for(int i =0;i<n;i++){
	
		if(visited[i])
			continue;
		int count =0;
		for(int j= i;j<n;j++){
		
			if(arr[i]==arr[j]){
			
				visited[j]=true;
				count++;

			}
		    }
		System.out.println(arr[i]+" --- "+count);
		}


	}



}
