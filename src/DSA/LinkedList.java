package DSA;

class Node {
	int data;
	Node next;

	Node(int d) {
		this.data = d;
		this.next = null;
	}
}

public class LinkedList {
	
	Node head = null;

	public void add(int d) {
		Node n = new Node(d);
		Node current = head;
		if (head == null) {
			head = n;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = n;
		}
	}

	public void printList() {
		Node current = head;
		while (current.next != null) {
			System.out.println(current.data);
		current = current.next;
		}
		System.out.println(current.data);

	}
	
	
	public void addFirst(int d) {
		Node n = new Node(d);
		n.next= head;
		head= n;
	}
	
	public void delete(int d) {
		Node current = head;
		while(current.next!=null && current.next.data!=d) {
			 current= current.next; 
		}
		if(current.next!=null) {
			current.next= current.next.next;
		}
	}

}
