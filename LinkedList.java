package package1;

public class LinkedList {
	Node head;

	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void insertAtPos(int data, int pos) {
		if (pos == 0) {
			insertAtBeginning(data);
		} else {
			Node newNode = new Node(data);
			Node temp = head;
			for (int i = 0; i < pos - 1; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	public void deleteAtPos(int pos) {
		if (pos == 0) {
			head = head.next;
		} else {
			Node temp = head;
			for (int i = 0; i < pos - 1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}

	public void deleteAfterNode(Node node) {
		if (node == null || node.next == null) {
			return;
		}
		Node temp = node.next;
		node.next = temp.next;
		temp.next = null;
	}

	public Node searchNode(int data) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == data) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertAtBeginning(10);
		ll.insertAtEnd(20);
		ll.insertAtPos(30, 1);
		ll.printList();
		ll.deleteAtPos(1);
		ll.printList();
		ll.deleteAfterNode(ll.head);
		ll.printList();
		Node node = ll.searchNode(20);
		if (node != null) {
			System.out.println("Node found: " + node.data);
		} else {
			System.out.println("Node not found");
		}
	}
}
