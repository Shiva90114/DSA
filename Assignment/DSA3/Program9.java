import java.util.*;

class StringNotVowel{
	static boolean isVowel(char ch){
		ch = Character.toLowerCase(ch);
		return ch == 'a' ||ch == 'e' ||ch == 'i' ||ch== 'o' ||ch =='u';
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number of Rows : ");
	int rows = sc.nextInt();
	System.out.println("Enter number of Columns : ");
        int cols = sc.nextInt();
	sc.nextLine();
	String[][] arr = new String[rows][cols];
	System.out.println("Enter Element of Array : ");
        
	for(int i=0;i<rows;i++){
	     for(int j=0;j<cols;j++){
		 arr[i][j]= sc.nextLine();
	     }
	}
	

	List<String> resultList = new ArrayList<>();
        for(int i =0;i<rows;i++){
	        for(int j=0;j< cols;j++){
		
		if(!isVowel(arr[i][j].charAt(0))){
	             resultList.add(arr[i][j]);

		 }
		}
	
	}
	String[] resultArray = resultList.toArray(new String[0]);
	 System.out.println("String Who not Start with Vowel :");
	 
         System.out.println(Arrays.toString(resultArray));

	sc.close();
	}
}
