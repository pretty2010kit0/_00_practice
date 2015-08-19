<<<<<<< HEAD
package node;

public class Node {
	
	int data; // 存放的数据
	Node next; // 下一个节点
	
	Node(int data){
		this.data = data; // 初始化data
		next = this;	// 将next引用指向当前对象(新创建的对象)
	}
	
	/**
	 * 
	 * @param head 循环链表的起始节点
	 * @param index 要插入的位置
	 * @param data 要插入的数据
	 * @return 循环链表的最新起始节点
	 */
	static Node insert(Node head, int index, int data){
		Node newNode = new Node(data); // 创建要插入的新节点
		Node node = head; // 当前节点
		int i = 0; // 当前节点位置
		if(index == 0){  // 插入的节点为首节点（取代原来的首节点）
			newNode.next = head; // 将新节点的next引用指向循环链表原来的首节点
			// 找到循环链表的最后一个元素，将它的next引用指向新节点
			while(node.next!=head){
				node = node.next;
			}
			node.next = newNode; // 找到了最后一个节点，将其指向新建的首节点
			return newNode; // 返回链表的最新首节点
		} else { // 插入的节点不是首节点(index!=0)
			 // 找到新节点插入的位置，
			// 循环正常结束时，得到新节点插入位置的前一个元素
			// 循环异常结束时，返回循环链表的首节点
			while(i!=index-1){
				i++;
				if(node.next != head){ // 到达最后一个节点
					node = node.next;
				} else {
					System.out.println("--下标越界！--");
					return head;
				}
			}
			// i==index-1
			// node 当前节点(新节点前面的节点)
			// newNode.next 新节点的下一个节点
			// node.next 新节点的下一个节点
			newNode.next = node.next; // 将新节点后的第一个节点位置信息放到新节点中
			node.next = newNode; // 将新节点的位置信息放到新节点前的第一个节点中
			return head;
		}
	}
	
	static int print(Node head){
		int length = 0 ;
		Node node = head;
		do{
			System.out.print(node.data + " ");
			node = node.next;
			length++;
		}while(node!=head);
		
		return length;
	}
	
	
}
=======
package node;

public class Node {
	
	int data; // 存放的数据
	Node next; // 下一个节点
	
	Node(int data){
		this.data = data; // 初始化data
		next = this;	// 将next引用指向当前对象(新创建的对象)
	}
	
	/**
	 * 
	 * @param head 循环链表的起始节点
	 * @param index 要插入的位置
	 * @param data 要插入的数据
	 * @return 循环链表的最新起始节点
	 */
	static Node insert(Node head, int index, int data){
		Node newNode = new Node(data); // 创建要插入的新节点
		Node node = head; // 当前节点
		int i = 0; // 当前节点位置
		if(index == 0){  // 插入的节点为首节点（取代原来的首节点）
			newNode.next = head; // 将新节点的next引用指向循环链表原来的首节点
			// 找到循环链表的最后一个元素，将它的next引用指向新节点
			while(node.next!=head){
				node = node.next;
			}
			node.next = newNode; // 找到了最后一个节点，将其指向新建的首节点
			return newNode; // 返回链表的最新首节点
		} else { // 插入的节点不是首节点(index!=0)
			 // 找到新节点插入的位置，
			// 循环正常结束时，得到新节点插入位置的前一个元素
			// 循环异常结束时，返回循环链表的首节点
			while(i!=index-1){
				i++;
				if(node.next != head){ // 到达最后一个节点
					node = node.next;
				} else {
					System.out.println("--下标越界！--");
					return head;
				}
			}
			// i==index-1
			// node 当前节点(新节点前面的节点)
			// newNode.next 新节点的下一个节点
			// node.next 新节点的下一个节点
			newNode.next = node.next; // 将新节点后的第一个节点位置信息放到新节点中
			node.next = newNode; // 将新节点的位置信息放到新节点前的第一个节点中
			return head;
		}
	}
	
	static int print(Node head){
		int length = 0 ;
		Node node = head;
		do{
			System.out.print(node.data + " ");
			node = node.next;
			length++;
		}while(node!=head);
		
		return length;
	}
	
	
}
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
