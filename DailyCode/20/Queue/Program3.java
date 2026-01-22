// Queue

import java.util.*;

class Node {

	int data;
	Node next;

	Node(int data) {

                this.data = data;
        }
}
class Queue {
	
	Node front = null;
	Node rear = null;

	void enqueue(int data){
		Node newNode = new Node(data);

		if(front == null) {
		
			front = newNode;
			rear = newNode;
		} else {
		
			rear.next = newNode;
			rear = newNode;
		}

	
	}
	boolean empty() {
	
		if(front == null)
			return true;
		else
			return false;
	}
	int dequeue(){
	
		int ret = front.data;
		if(front == rear) {
		  //      int ret = front.data;
		       	  front = rear = null;
		 // 	  return ret;
		} else {
		//	int ret = front.data;
			front = front.next;
		//	return ret;
		
		}
		return ret;
	}
	int front() {
	
		return front.data;
	}
	int rear() {
	
		return rear.data;
	}
	void printQueue() {
	
		rear = front;

		while(rear.next != null) {
		
			System.out.print(rear.data+" ");
			rear = rear.next;
		}
		 System.out.println(rear.data);
	}

}
class Client {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		
		char ch;
		Queue que = new Queue();

		do {
		
	        	System.out.println("Queue : LinkedList");

                        System.out.println("1.Enqueue");
                        System.out.println("2.Dequeue");
                        System.out.println("3.Front");
                        System.out.println("4.Rear");
                        System.out.println("5.Empty");
                        System.out.println("6.Print Queue");

                        System.out.println("Enter Your Choice : ");
                        int choice =sc.nextInt();

                        switch(choice){

                                case 1 :{
                                                System.out.println("Enter Data");
                                                int data = sc.nextInt();
                                                que.enqueue(data);

                                        }
                                break;
                                case 2:{

                                               if(que.empty()){

                                                       System.out.println("Queue is Empty");
                                               } else {

                                                       int ret = que.dequeue();
                                                       System.out.println(ret+" popped");
                                               }
                                }
                                break;
                                case 3:{

                                               if(que.empty()){

                                                       System.out.println("Queue is Empty");
                                               } else {

                                                       int ret = que.front();
                                                       System.out.println("Front : "+ret);
                                               }
                                }
                                break;
				case 4:{

                                               if(que.empty()){

                                                       System.out.println("Queue is Empty");
                                               } else {

                                                       int ret = que.rear();
                                                       System.out.println("Rear : "+ret);
                                               }
                                }
                                break;
                                case 5:{
                                               if(que.empty()){

                                                       System.out.println("Queue is Empty");
                                               } else {

                                                       System.out.println("Queue is Not Empty");
                                               }

                                }
                                break;
                                case 6:{
                                               if(que.empty()){

                                                       System.out.println("Queue is Empty");
                                               } else {

                                                      que.printQueue();
                                               }

                                }
                                break;
                                default: {

                                                 System.out.println("Wrong Choice");

                                }
                        }
                                System.out.println("Do you want to contunue ?");
                                ch = sc.next().charAt(0);

                }while(ch == 'y' || ch =='Y');
        }
}

