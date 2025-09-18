import java.util.*;


class StringChar{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter String : ");
	String str = sc.nextLine();
	System.out.println("Vowels in String: ");
	for(int i=0;i<str.length();i++){
	
		char ch = Character.toLowerCase(str.charAt(i));
		if(ch =='a' || ch =='e' ||ch == 'i'  || ch == 'o' ||ch == 'u'){
		  System.out.println(ch+"");
		}
	
	}
	System.out.println("Consonants in String : ");
        for(int i=0;i<str.length();i++){

                char ch = Character.toLowerCase(str.charAt(i));
                if(!(ch =='a' || ch =='e' ||ch == 'i'  || ch == 'o' ||ch == 'u')){
                  System.out.println(ch+"");
                }

        }        	
	}
}
