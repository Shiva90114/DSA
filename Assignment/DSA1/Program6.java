import java.util.*;

class OddEven{

	static int  digit(int x){
	
        String str = String.valueOf(x);

	System.out.println("Even Digit and Square of Odd Digit Number  ");
	for(int i =0;i<str.length();i++){
	int d = Character.getNumericValue(str.charAt(i));

		if(d%2!=0){
                         System.out.print(d*d);
                
                }
		else{
		
			System.out.print(d);
		}
        
        }

        System.out.println();        
        return 0;	
	}

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	int num = sc.nextInt();

	System.out.println(digit(num));

	}
}
