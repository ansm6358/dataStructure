package MyList;

public class SimpleListApp {

	public static void main(String[] args) {
//		SimpleArrayList aList = new SimpleArrayList();
		SimpleLinkedList aList = new SimpleLinkedList();
		
		aList.add(aList.sizeOf(), "aaa");
		aList.add(aList.sizeOf(), "bbb");
		aList.add(aList.sizeOf(), "ccc");
		aList.add(aList.sizeOf(), "ddd");
		System.out.println("bbb의 인덱스: "+aList.indexOf("bbb"));
		System.out.println("2번 배열  제거: "+aList.remove(2));
		System.out.println("결과: "+aList.toString());
		System.out.println("ddd 제거: "+aList.remove("ddd"));
		System.out.println("결과: "+aList.toString());
	}

}
