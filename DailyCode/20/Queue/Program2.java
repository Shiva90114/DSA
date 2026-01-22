// Queue

import java.util.*;
class Queue {

	int queueArr[];
	int front = -1;
	int rear = -1;
	int maxSize;

	Queue(int maxSize){
	
		queueArr = new int[maxSize];
		this.maxSize = maxSize;
	}
	void enqueue(int data) {
	
		if(rear == maxSize-1){
		
			 System.out.println("Queue is Full ");
		
			 return;
		}
		/*if(front == -1) {
			front++;
			rear++;
			queueArr[rear] = data;
		} else {
	
		              rear++;
		      queueArr[rear]= data;	      
		}*/
		if(front == -1){
		
			front = rear=0;
		} else{
		
			rear++;
		}
		queueArr[rear]= data;
	}

	boolean empty(){
	
		if(front == -1)
			return true;
		else
			return false;
	}
	int dequeue(){
		int val = queueArr[front];
		front++;
		if(front > rear){
		
			front = rear = -1;
		}
		return val;
	

	}
	int front() {
	
		return queueArr[front];
	}
	int rear() {
	
		return queueArr[rear];
	}
	void printQueue() {
	
		for(int i =front;i<=rear;i++){
		
			System.out.print(queueArr[i]+" ");
		}
		System.out.println();
	}
	
}

class Client {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Queue Size : ");
		int size = sc.nextInt();

		char ch;
		Queue que = new Queue(size);

		do {
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
						       System.out.println("Front : ");
					       }
				}
				break;
				case 4:{

                                               if(que.empty()){

                                                       System.out.println("Queue is Empty");
                                               } else {

                                                       int ret = que.rear();
                                                       System.out.println("Rear : ");
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
