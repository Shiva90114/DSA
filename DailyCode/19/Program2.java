// Stack 
// Use Array

import java.util.*;

class Stack {

	int maxSize;
	int top = -1;
	int stackArr[];

	Stack(int maxSize) {
	
		this.maxSize = maxSize;
		stackArr = new int[maxSize];
	}
	void  push(int data) {
		if(top == maxSize - 1) {
		
			 System.out.println("Stack OverFlow");
			 return;
		}else{
		
			top++;
			stackArr[top] = data;
		}

		
	}
	boolean empty() {
	
		if(top == -1)
			return true;
		else 
			return false;
	}
	int pop(){
		if(empty()) {
		
			System.out.println("Stack UnderFlow");
			return -1;
		} else {
		
			int val = stackArr[top];
			top--;
			return val;
		}

	}
	int peek(){
	
		if(empty()) {

                        System.out.println("Stack UnderFlow");
                        return -1;
                } else {

                             return stackArr[top];
                }
	}
	int size() {
	
		return top;
	}
	void printStack() {
	
		System.out.print("[");
		for(int i =top;i>= 0;i++){
		
			System.out.print(stackArr[i] + ",");
		}
		System.out.print("]");

	}


	
	}


class Client {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Stack size");
		int size = sc.nextInt();

		Stack st = new Stack(size);

		char ch;
		do {
		
			System.out.println("Stack : Array");
			
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Empty");
			System.out.println("5. Size");
			System.out.println("6. Print Stack");

			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();

			switch(choice) {
			
				case 1 :{
				
						System.out.println("Enter Data");
						int data = sc.nextInt();
						st.push(data);
				}
                                break;
                                case 2 :{

                                                int val = st.pop();
						if(val != -1){
					 	System.out.println(val + " is Popped");
                                }
				}
				break;
	                        case 3 :{

						int val = st.peek();
                                                if(val != -1){
                                                System.out.println(val);
                                }}
				break;
				case 4 :{
						if(st.empty()) {

                                                System.out.println("Stack is Empty");
                                } else {
					System.out.println("Stack is  Not Empty");
				}
				}
				break;
				case 5 :{ 
                                                
                                                int sz = st.size();
                                                System.out.println("Size : " + (sz + 1));
                                }
				break;
				case 6 :{

						st.printStack();
					}	
					break;
			 
				default :{

                                                System.out.println("Wrong Choice");
                                }

			}
			 System.out.println("Do you Want to continue ?");
			 ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		
		
	
	}
}

