<<<<<<< HEAD
package node;

public class NodeTest {
	public static void main(String[] args) {
		int length = 0;
		Node head = new Node(2);
		head = Node.insert(head, 1, 3);
		head = Node.insert(head, 2, 4);
		head = Node.insert(head, 3, 6);
		head = Node.insert(head, 2, 8);
		head = Node.insert(head, 1, 11);
		length = Node.print(head.next.next
				.next.next.next.next.next.next.next);
		System.out.println("\nlength:"+length);
	}
}
=======
package node;

public class NodeTest {
	public static void main(String[] args) {
		int length = 0;
		Node head = new Node(2);
		head = Node.insert(head, 1, 3);
		head = Node.insert(head, 2, 4);
		head = Node.insert(head, 3, 6);
		head = Node.insert(head, 2, 8);
		head = Node.insert(head, 1, 11);
		length = Node.print(head.next.next
				.next.next.next.next.next.next.next);
		System.out.println("\nlength:"+length);
	}
}
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
