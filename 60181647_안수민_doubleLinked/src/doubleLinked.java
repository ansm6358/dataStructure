public class doubleLinked {
	class Node {
		String data;
		int pri;
		Node next;
		Node prev;

		public Node(String str, int p) {
			data = str;
			pri = p;
			prev = null;
			next = null;
		}

		public String toString() {
			return data + "[" + pri + "]";
		}
	}

	Node head;
	Node tail;
	int size;

	public doubleLinked() {
		head = null;
		tail = null;
		size = 0;
	}

	public void add(String str, int p) {
		Node newNode = new Node(str, p);
		if (head == null) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
		Node temp = head;
		for (int i = 0; i < size; i++) {
			if (temp.pri > p) {
				if (temp.prev == null && temp.pri != p) {
					head.prev = newNode;
					newNode.next = head;
					head = newNode;
					size++;
					return;
				} else {
					temp.prev.next = newNode;
					newNode.prev = temp.prev;
					temp.prev = newNode;
					newNode.next = temp;
					size++;
					return;
				}
			} else {
				temp = temp.next;
			}

		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		size++;
		}
		

	}

	public void remove(String str) {
		Node temp = head;
		for (int i = 0; i < size; i++) {
			if (str == temp.data) {
				if (i == 0) {
					head.next.prev = null;
					head = temp.next;
				} else if (i == (size - 1)) {
					tail.prev.next = null;
					tail = tail.prev;
				} else {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
				}
				size--;
				return;
			} else {
				temp = temp.next;
			}
		}
	}

	public int sizeOf() {
		return size;
	}

	public String toString() {
		String ret = "";
		Node temp = head;
		for (int i = 0; i < size; i++) {
			ret += temp.toString() + "\n";
			temp = temp.next;
		}
		return ret;
	}

	public static void main(String[] args) {
		doubleLinked test = new doubleLinked();
		test.add("shopping", 4);
		test.add("gym", 2);
		test.add("sleep", 3);
		System.out.println("'add 했을 경우'");
		System.out.println(test.toString());

		test.remove("sleeping");
		System.out.println("'rink에 없는 문자 remove'");
		System.out.println(test.toString());

		test.remove("sleep");
		System.out.println("'rink에 존재하는 문자 remove'");
		System.out.println(test.toString());

	}

}
