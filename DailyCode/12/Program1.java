/*Q.1.
 *
 *     void fun(){
 *
 *                   print("Hello");
 *                   fun();
 *     }
 *
 * 
 */
class Recurssion{

	static void fun(){
	
		System.out.println("Hello");
		fun();
	}
	public static void main(String[] args){
	
		fun();
	}
}
