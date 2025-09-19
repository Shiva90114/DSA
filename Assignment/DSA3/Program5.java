import java.util.*;

class NumArmstrong{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number : ");
	int num = sc.nextInt();
	
	int temp = num;
	int digits = 0;
	int t=num;
	while(t>0){
	
		digits++;
		t= t/10;

	}
	int sum =0;
	temp = num;
	while(temp>0){
	
		int digit = temp%10;
		int power =1;
		int i = digits;
		while(i>0){
		
			power =power*digit;
			i--;
		}
		sum =sum+power;
		temp = temp/10;
	}
	if(sum ==num){

        System.out.println(num+" is Armstrong Number : ");
        } else{
	System.out.println(num+" is not ArmStrong Number :" );        
	}
}
}
