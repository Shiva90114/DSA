// LinkedList
// 2.addLast

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
	void printLinkedList() {
	if(head == null) {
			System.out.println("LinkedList is Null");
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
	}
}
