/*Q.6.
 *
 *     int printNum(int num){
 *           if(num==0)
 *                 return 1;
 *           printNum(--num);
 *           return 5 + num;
 *     }
 *     printNum(3);
 *    //             Output:7
 *
 * */

class Recurssion{

	static  int printNum(int num){
	
		if(num==0)
			return 1;
		printNum(--num);
		return 5 + num;

	}
	public static void main(String[] args){
	
	System.out.println(printNum(3));
	}
}
