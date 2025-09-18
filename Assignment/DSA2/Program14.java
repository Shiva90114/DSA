import java.util.*;

class StringFrequency{
	public static void main(String[] args){
	
	Scanner  sc = new Scanner(System.in);
        
	System.out.println("Enter String : ");
	String str = sc.nextLine();

	int n= str.length();
	boolean[] visited = new boolean[n];

	System.out.println("Frequency of each Element :");
	for(int i =0;i<n;i++){
	
		if(visited[i])
			continue;
		int count =0;
		for(int j= i;j<n;j++){
		
			if(str.charAt(i)==str.charAt(j)){
			
				visited[j]=true;
				count++;

			}
		    }
		System.out.println(str.charAt(i)+" --- "+count);
		}


	}



}
