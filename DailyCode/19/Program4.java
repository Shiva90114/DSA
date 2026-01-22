// Stack 
// Use LinkedList
// Singly 
import java.util.*;

class Node {

	int data;
	Node next = null;

	Node(int data){
	
		this.data= data;
	}
}
class Stack {

	Node top =null;
	boolean empty(){
	
		if(top == null)
			return true;
		else 
			return false;
	}


	void  push(int data) {
	
		Node newNode = new Node(data);
		if(top == null){
			top = newNode;
		} else {
			newNode.next= top;
			top = newNode;

		}
	}
	int pop(){
		int val  = top.data;
		top = top.next;
		return val;
	}
	int peek(){
	
		return top.data;
		
	}
	int size() {
	
		Node temp = top;

		int count = 0;

		while(temp != null){
		
			temp.next=temp;
			count++;
		}
		return count;
	}
	void printStack() {
       
		if(empty()) {
		System.out.println("Stack is Empty");
		return;
		}
		Node temp = top;
	        System.out.print("[");        
       	
		while(temp.next != null){
		
			System.out.print(temp.data + " ");
			temp= temp.next;
		}
		System.out.print(temp.data+"]");


	System.out.println();
}
}

class Client {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
                Stack st = new Stack();
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
						if(st.empty()) {                                       

                                                System.out.println("Stack UnderFlow");               
                                                } else {                                             
						        int val = st.pop();
						System.out.println(val + " is Popped");
                                }
				}
				break;
	                        case 3 :{
						if(st.empty()) {

                                                System.out.println("Stack UnderFlow");
                                                } else {
                                                        int val = st.peek();
                                                         System.out.println("Top Element = " + val);
                                }

					
                                }
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
                                                System.out.println("Size : "+ sz);
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

