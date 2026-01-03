/*Q.
 * Print 1 to 10 use Recurssion
 * 
 *
 * */
class PrintData{

	static void printN(int num){
		if(num==11)
			return;
		System.out.println(num);
		printN(++num);
	
	}
	public static void main(String[] args){
	printN(1);
	}
}
