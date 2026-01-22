// Problem - 2
// Two  stack using an Array

import java.util.*;
class TwoStacks {

	int stackArr[];
	int top1;
	int top2;
	int maxSize;

	TwoStacks(int size) {
  
		this.stackArr = new int[size];
	        this.top1 = -1;
	        this.top2 = size;
	        this.maxSize = size;	
	}
       void push1(int data){
       
	       if(top2-top1 > 1) {
	       
		       top1++;
		       stackArr[top1] = data;
	       } else {
	       
		       System.out.println("Stack OverFlow");
	       }

       }
       void push2(int data){

               if(top2-top1 > 1) {

                       top2--;
                       stackArr[top2] = data;
               } else {

                       System.out.println("Stack OverFlow");
               }
       }
       int pop1() {
       
	       if(top1 == -1) {
	       
		       System.out.println("Stack1 is empty");
		       return -1;
	       } else {
	       
		       int val = stackArr[top1];
		       top1--;
		       return val;

	       }

       }
       int pop2() {

               if(top2 == maxSize) {

                       System.out.println("Stack2 is empty");
                       return -1;
               } else {

                       int val = stackArr[top2];
                       top2++;
                       return val;

               }

       }

              



}
class Client {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter size of Array : ");
	int size = sc.nextInt();

	TwoStacks obj = new TwoStacks(size);
	char ch;
	do {
	
		System.out.println("1.Push1");
		System.out.println("2.Push2");
		System.out.println("3.pop1");
		System.out.println("4.pop2");

		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();

		switch(choice){
		
			case 1 :{
			
					System.out.println("Enter Element for Stack1");
					int data = sc.nextInt();
					obj.push1(data);
			        }
		                    break;
			case 2 :{
			
					System.out.println("Enter Element for Stack2");
                                        int data = sc.nextInt();
                                        obj.push2(data);
			        }
				break;
			case 3 :{
			
					int ret = obj.pop1();
					if(ret!= -1) {
					
						System.out.println(ret +" popped from stack1");

					}
		        	}
				break;

			case 4 : {
			
					int ret = obj.pop2();
                                        if(ret!= -1) {

                                                System.out.println(ret +" popped from stack1");

                                        }
		               	 }
				 break;
			default :
				          System.out.println("Wrong Choice");
					  break;
		


                  }
		System.out.println("Do you want to Continue ?");
		ch = sc.next().charAt(0);

	}while(ch == 'y' || ch == 'Y');
	}
}
