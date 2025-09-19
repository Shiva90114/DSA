import java.util.*;

class StrArrayPalindrome{
	static boolean isPalindrome(String str){
	int left = 0,right=str.length()-1;
	while(left<right){
	
		if(str.charAt(left) !=str.charAt(right)){
		return false;
		}
		left++;
		right--;
	}
	return true;
	}

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number of String : ");
	int n = sc.nextInt();
        sc.nextLine();
	String[] arr = new String[n];
	System.out.println("Enter the String :");
	for(int i=0;i<n;i++){
	
		arr[i] = sc.nextLine();
	}
	String firstP = null;
	for(int i=0;i<arr.length;i++){
	
		if(isPalindrome(arr[i])){
		firstP =arr[i];
		break;
		}
	}
	if (firstP != null){

        System.out.println("First Palindrome String is :  "+firstP);
        } else{
	System.out.println("No Palindrome String:" );        
	}
}
}
