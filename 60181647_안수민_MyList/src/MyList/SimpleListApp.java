package MyList;

public class SimpleListApp {

	public static void main(String[] args) {
//		SimpleArrayList aList = new SimpleArrayList();
		SimpleLinkedList aList = new SimpleLinkedList();
		
		aList.add(aList.sizeOf(), "aaa");
		aList.add(aList.sizeOf(), "bbb");
		aList.add(aList.sizeOf(), "ccc");
		aList.add(aList.sizeOf(), "ddd");
		System.out.println("bbb�� �ε���: "+aList.indexOf("bbb"));
		System.out.println("2�� �迭  ����: "+aList.remove(2));
		System.out.println("���: "+aList.toString());
		System.out.println("ddd ����: "+aList.remove("ddd"));
		System.out.println("���: "+aList.toString());
	}

}
