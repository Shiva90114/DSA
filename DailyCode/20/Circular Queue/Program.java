// Implement Circular Queue

import java.util.*;

class CircularQueue {

	int queueArr[];
	int front;
	int rear;
	int maxSize;

	CircularQueue(int size) {
	
		this.queueArr = new int[size];
		this.front = -1;
		this.rear = -1;
		this.maxSize= size;
	}

	void enqueue(int data) {
	
		if((front ==0 && rear == maxSize-1) || ((rear +1 )%maxSize == front)) {
	       

	
                             System.out.println("Queue is Full");
			     return;
		} else if(front == -1) {
		
			front = rear =0;
		} else if(rear == maxSize - 1 && front != 0){
		
			rear =0;
		} else {
		
			rear++;
		}
	        queueArr[rear] = data;

	}
	int dequeue(){
	
		if(front == -1) {
		
			System.out.println("Queue is Empty");
			return -1;

		} else {
		
			int ret = queueArr[front];
			if(front  == rear){
			
				rear = front = -1;
			} else if(front  == maxSize-1) {
			
				front =0;
			} else {
			
				front++;
			}
			return ret;
		}
	}
	void printQueue() {
        
		if(front <= rear) {
		
			for(int i = front;i<=rear;i++){
			
				System.out.print(queueArr[i] +" ");
			}
		}	else {
			
				for(int i = front;i<=maxSize-1;i++){
				
					System.out.print(queueArr[i] +" ");
				}
				for(int i = 0;i<=rear;i++){

                                        System.out.print(queueArr[i] +" ");
                                }
			}
			 System.out.println();
		}
	 	
	
}
class Client {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Size of an Array");
	int size = sc.nextInt();
	CircularQueue cq = new CircularQueue(size);

	char ch;

	do{
		System.out.println("1.Enqueue");
		System.out.println("2.Dequeue");
		System.out.println("3.PrintQueue");

		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();

		switch(choice) {
		
			case 1:{
				       System.out.println("Enter Data For Enqueue : ");
				       int data = sc.nextInt();
				       cq.enqueue(data);

		    	}
			break;
			case 2:{
			
				       int ret = cq.dequeue();
				       if(ret != -1 )
					       System.out.println(ret +"  popped");

			}
			break;
			case 3:cq.printQueue();
			       break;
			default:
			       System.out.println("Wrong Input");

		}
		System.out.println("Do you want to Continue ? ");
		ch = sc.next().charAt(0);
	
	}while(ch=='y' || ch == 'Y');





	}
}
