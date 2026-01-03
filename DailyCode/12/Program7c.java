/*Q.
 * Print 10 to 1 use Recurssion
 *
 *
 * */
class PrintData{

        static void printN(int num){
                if(num==0)
                        return;
                System.out.println(num);
		printN(--num);

        }
        public static void main(String[] args){
        printN(10);
        }
}
