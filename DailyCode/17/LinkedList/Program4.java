// LinkedList
// 4.removeFirst

class Node {


	int data;
	Node next = null;

	Node(int data){
	
		this.data = data;
	}
}

class LinkedList {

	Node head = null;

	void addFirst(int data) {

		Node newNode = new Node(data);
		if(head == null) {
		
			head = newNode;
		} else {
		
			newNode.next = head;
			head = newNode;
		}

	
	}
	void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
		
			head = newNode;
		} else {
		
			Node temp= head;
			while(temp.next != null) {
			
				temp = temp.next;
			}
			temp.next = newNode;

		}
	

	}

	int countNode() {
	
		int count = 0;
		Node temp = head;
		while(temp != null) {
		
			count++;
			temp = temp.next;
		}
		return count;
	}
	void addAtPos(int pos,int data){
	
		if(pos <= 0 || pos > countNode()+1){
		
			System.out.println("Wrong Input for Position");
			return;
		}
		if(pos == 1) {
		
			addFirst(data);

		} else if(pos == countNode()+1) {
		
			addLast(data);
		} else {
		
			Node newNode = new Node(data);
			Node temp = head;
			while(pos-2 != 0) {
			
				temp = temp.next;
				pos--;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}



	}
	void deleteFirst() {
	
		if(head == null) {
		
			System.out.println("Node nahi aahe Delete Karayala");

		} else {
		
		head = head.next;
		}
	
	}

	void printLinkedList() {
	if(head == null) {
			System.out.println("LinkedList is Empty");
                        return;
	}  else {
	        Node temp  = head;
		while(temp.next != null) {
		
		
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println(temp.data);

	
	}
	
	
	}


}
class Client {

	public static void main(String[]  args) {
	
		LinkedList ll = new LinkedList();

		ll.addFirst(30);
		ll.addFirst(20);
		ll.addFirst(10);

		ll.printLinkedList();
		ll.addLast(40);
		ll.printLinkedList();

		ll.addAtPos(2,25);
		ll.printLinkedList();
		ll.deleteFirst(); 
		ll,deleteLast();
		ll.printLinkedList();

	}
}
