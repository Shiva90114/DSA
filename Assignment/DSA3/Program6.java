import java.util.*;

class NumDuck{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number : ");
	int num = sc.nextInt();
	String str = String.valueOf(num);
	
	boolean isDuck =false;
	for(int i=1;i< str.length();i++){
	
	if(str.charAt(i) == '0'){
	
		isDuck= true;
		break;
	     }
	}
	if (isDuck){

        System.out.println(num+" is Duck Number : ");
        } else{
	System.out.println(num+" is not Duck Number :" );        
	}
}
}
