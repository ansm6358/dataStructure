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
		// 여기에 새로운 node를 생성하여 맨 앞에 삽입하도록 코드를 완성하시오.
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
		// 여기에 맨 앞의 node를 삭제하고 
		// 데이터 값(vNumber)를 return하도록 코드를 완성하시오.
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
		// 여기에 두  linked list의 모든 노드 값이 같은 경우 true를,
		// 아니면 false를 return하는 코드를 작성하시오.
		
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
