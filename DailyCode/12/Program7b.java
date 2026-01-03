/*Q.
 * Print 1 to 10 use Recurssion
 *
 *
 * */
class PrintData{

        static void printN(int num){
                if(num==0)
                        return;
                
                printN(--num);
		System.out.println(num+1);// num =0 /

        }
        public static void main(String[] args){
        printN(10);
        }
}
