package MyList;

public class SimpleLinkedList {
	Node head;
	int size;

	public SimpleLinkedList() {
		head = null;
		size = 0;
	}

	String get(int index) {
		if (index < 0 || index > size - 1) {
			return null;
		} else {
			Node temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.next;

			}
			return temp.data;
		}

	}

	void add(int index, String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			size++;
		} else if (index == 0) {
			newNode.next = head;
			head = newNode;
			size++;
		} else if (index == size) {
			Node temp = head;
			for (int i = 0; i < size - 1; i++) {
				temp = temp.next;
			}
			temp.next = newNode;
			size++;
		} else {

			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			size++;
		}
	}

	String remove(int index) {
		Node temp = head;
		Node oldTemp = null;
		String val = null;
		if (index < 0 || index > size) {
			return null;
		} else if (index == 0) {
			val = temp.data;
			head = temp.next;
			size--;
		} else {
			for (int i = 0; i < size; i++) {
				if (i == index) {
					val = temp.data;
					oldTemp.next = temp.next;
					size--;
				}
				oldTemp = temp;
				temp = temp.next;
			}
		}
		return val;
	}

	boolean remove(String data) {
		int temp = indexOf(data);
		return (remove(temp) != null);
	}

	int indexOf(String str) {
		Node temp = head;

		for (int i = 0; i < size; i++) {
			if (temp.data == str) {
				return i;
			}
			temp = temp.next;
		}
		return -1;
	}

	int sizeOf() {
		return size;
	}

	public String toString() {
		Node temp = head;
		String result = "";
		for (int i = 0; i < size; i++) {
			result = result + temp.data.toString() + " ";
			temp = temp.next;
		}
		return result;
	}
}
