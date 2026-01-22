// Linked List
//
//Singly LinkedList
//
// All Method

import java.util.*; // Scanner

class Node {

	int data;
	Node next = null;
	Node(int data) {
	
		this.data= data;
	}
}
class LinkedList {

	Node head = null;

	void addFirst(int data){
		Node newNode = new Node(data);
		if(head == null) {
		
			head = newNode;
		} else {
		
			newNode.next = head;
			head = newNode;
		}
	}
	void addLast(int data){
		Node newNode = new Node(data);
		if(head == null) {

                        head = newNode;
			return;
                } else {

			Node temp = head;
			while(temp.next != null) {
			
				temp = temp.next;
			}
			temp.next = newNode;
		} 
 	}

	int countNode(){
		int count = 0;
		Node temp = head;
		while(temp !=  null){
		
			count++;
	                temp = temp.next;
		}
		return count;
        }
	void addAtPos(int pos,int data){
        
		
		if(pos <=0 || pos>countNode() +1) {
		
			System.out.println("Wrong Input for Position");
		
			return;
		}
		if(pos == 1) {
		
			addFirst(data);
		
			
		} else if(pos == countNode() +1){
		
			addLast(data);
		} else {
		
			Node newNode = new Node(data);
			Node temp = head;
			while(pos-1 != 0) {
			
				temp = temp.next;
				pos--;
			}
			newNode.next = temp.next;
		        temp.next = 	newNode;
		}

	}
	void deleteFirst(){
                
                if(head == null) {

			System.out.println("No any Node");
                } else {

                       
                        head = head.next;
                }
        }
        void deleteLast(){
                 if(head == null) {

                        System.out.println("No any Node");
			return;
                } 
	        if(countNode() == 1){
		
			head = null;
		}else{
                        Node temp = head;
                        while(temp.next.next != null) {

                                temp = temp.next;
                        }
                        temp.next = null;
		}
        
	}
        void deleteAtPos(int pos){

		if(pos <= 0 || pos > countNode()) {

                        System.out.println("Wrong Input for Position");

                        return;
                }
                if(pos == 1) {

                        deleteFirst();
                } else if(pos == countNode()){
                        deleteLast();
                } else {
                        Node temp = head;
                        while(pos-2 != 0) {

                                temp = temp.next;
                                pos--;
                        }
                        
                        temp.next =  temp.next.next;
                }
        }
	void printLinkedList(){
		if(head == null){
		
			System.out.println("LinkedList is Empty");
			return;
		} else {
		
			Node temp = head;
			while(temp.next != null){
			
				System.out.print(temp.data +"->");
				temp=temp.next;
			}
			 System.out.println(temp.data);
		}
        
        }

}
class Client {

	public static void main(String[] args){
	

		LinkedList ll = new LinkedList();
		char ch;
	       do{
		       System.out.println("Singly LinkedList");
		       System.out.println("1.addFirst");
		       System.out.println("2.addLast");
		       System.out.println("3.addAtPosition");
		       System.out.println("4.deleteFirst");
		       System.out.println("5.deleteLast");
		       System.out.println("6.deleteAtPosition");
		       System.out.println("7.Count Node");
		       System.out.println("8.Print LinkedList");

		   Scanner sc = new Scanner(System.in);
		   int choice = sc.nextInt();
		   switch(choice) {
		   
			   case 1 :{
			   
					   System.out.println("Enter Data");
					   int data=sc.nextInt();
					   ll.addFirst(data);
			                   break;         
			   }
		           case 2 :{

                                           System.out.println("Enter Data");
                                           int data=sc.nextInt();
                                           ll.addLast(data);
                                           break;         
			   }
		          case 3 :{
                                           System.out.println("Enter Position");
                                           int pos=sc.nextInt();
                                           System.out.println("Enter Data");
                                           int data=sc.nextInt();
                                           ll.addAtPos(pos,data);
                           break;          
			  }		   

	                 case 4 : ll.deleteFirst();
				  break;
	                 case 5 :ll.deleteLast();
				  break;

	                 case 6 :System.out.println("Enter Position");
				 int pos = sc.nextInt();
				 ll.deleteAtPos(pos);
                                  break;
			 case 7 :int count = ll.countNode();
				 System.out.println(count);
				 
                                 break;
			 case 8 : ll.printLinkedList();
				  break; 
			 default :
				  System.out.println("Wrong Input ");

		   }
		   System.out.println();
		   System.out.println("Do you wan't to contine ?");
		   ch = sc.next().charAt(0); 


	       
	       }while(ch == 'y'  || ch == 'Y');

	}
}
