package midTermExam;

public class Node {
	int vNumber;
	Node next;
	
	public Node(int num) {
		vNumber = num;
		next = null;
	}
	
	public String toString() {
		return "["+vNumber+"]";
	}	
}