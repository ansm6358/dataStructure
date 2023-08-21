package midTermExam;

import java.util.NoSuchElementException;

public class MTElinkedList {

	Node head;
	int listSize;
	
	public MTElinkedList () {
		head = null;
		listSize = 0;
	}
	
	public void add(int num) {
		// ���⿡ ���ο� node�� �����Ͽ� �� �տ� �����ϵ��� �ڵ带 �ϼ��Ͻÿ�.
		Node newNode = new Node(num);
		if (head == null) {
			head = newNode;
			listSize++;
		} else{
			newNode.next = head;
			head = newNode;
			listSize++;
		}
		
		
	}
	
	public int get(int index) {
		if (index<0||index>=listSize)
			throw new ArrayIndexOutOfBoundsException();
		Node temp = head;
		for (int i=0;i<index; i++) {
			temp=temp.next;
		}
		return temp.vNumber;
	}
	
	public int remove() {
		// ���⿡ �� ���� node�� �����ϰ� 
		// ������ ��(vNumber)�� return�ϵ��� �ڵ带 �ϼ��Ͻÿ�.
		if(head==null) {
			throw new NoSuchElementException();
		}
		int vNumber = head.vNumber;
		head = head.next;
		listSize--;
		return vNumber;

	}
	
	public int indexOf(int num) {
		Node temp = head;
		for (int i=0; i<listSize; i++) {
			if (num ==temp.vNumber)  
				return i;
			temp=temp.next;		
		}
		throw new NoSuchElementException();
	}

	public int sizeOf() {
		return listSize;
	}
	
	public boolean equals(MTElinkedList other) {
		// ���⿡ ��  linked list�� ��� ��� ���� ���� ��� true��,
		// �ƴϸ� false�� return�ϴ� �ڵ带 �ۼ��Ͻÿ�.
		
		if(listSize == other.listSize) {
			Node tempNode = head;
			for(int i=0; i<listSize; i++) {
				if(tempNode.vNumber != other.get(i)) {
					return false;
				} else {
					tempNode = tempNode.next;
				}
			}
			return true;
		} else {
		return false;
		}
		
	
	
	
	
	
	
	
	}
	
	public String toString() {
		String retString = "";
		Node temp = head;
		while (temp!=null) {
			retString += temp.toString();
			temp=temp.next;
			if (temp!=null)
				retString += " --> ";
		}
		return retString;
	}	
}
