package finExam;

import java.util.ArrayList;

public class Exam {
	
	ArrayList<Character> table;
	int inputNumber;
	
	public static void main(String[] args) {
		
		int numberOfInput=10;
		char [] data = {'m','y','u','n','g','j','i','d','h','k'};
		
		// return 값으로 ArrayList<Character> type의 heap table를 돌려주도록
		// HEAP class를 만드시오. (기존 코드 이용하여 수정 적용 가능)
		// 꼭 필요한 method는 inserthHeap 하나뿐이므로, 다른 method는 평가하지 않음
		Heap myheap = new Heap();
		ArrayList<Character> table = new ArrayList<Character>();
		// to make Heap with input data array 'data[]'
		for (int i=0; i<numberOfInput; i++)
			table = myheap.insertHeap(data[i]);
		// to print out Heap
		System.out.println("*** Heap Contents (index-order) "); 
		for (int i=0; i<numberOfInput; i++)
			System.out.print((i+1)+" : "+table.get(i+1)+ "  "); 
		
		// array에 저장된 complete binary tree를 input으로 받아서
		// preorder, inorder, postorder 순으로 각각 출력하도록
		// TreeTraverseInArray class를 만드시오.
		// 최소한 preorder, inorder, postorder의 세가지 method를 포함해야하며,
		// 다른 method는 평가하지 않음
		
		TreeTraverseInArray me = new TreeTraverseInArray (table);
		// to print out Tree Traverse results 
		System.out.println("\n*** Preorder Traverse");
		me.preorder(1);
		System.out.println("\n*** Inorder Traverse");
		me.inorder(1);
		System.out.println("\n*** Postorder Traverse");
		me.postorder(1);
		System.out.println();
		
		// 동일한 character array를 vertex의 array로 이용합니다.
		// 다음과 같이 insertVertex, insertEdge, BFS, DFS, showGraph의 
		// 5가지 method를 제공하는  Graph class를 만드시오 (기존코드 이용 가능)
		// 구현 방식은 adjacent matrix나 adjacent list 중 원하는 방식을 적용.  
		Graph<Character> myG = new Graph<>(table.size());
		
		for (int i=1; i<table.size(); i++)
			myG.insertVertex(table.get(i));
		
		myG.insertEdge(table.get(1), table.get(3));
		myG.insertEdge(table.get(1), table.get(2));
		myG.insertEdge(table.get(2), table.get(7));
		myG.insertEdge(table.get(3), table.get(6));
		myG.insertEdge(table.get(4), table.get(2));
		myG.insertEdge(table.get(4), table.get(3));
		myG.insertEdge(table.get(5), table.get(3));
		myG.insertEdge(table.get(6), table.get(1));
		myG.insertEdge(table.get(7), table.get(5));
		myG.insertEdge(table.get(7), table.get(1));
		myG.insertEdge(table.get(8), table.get(7));
		myG.insertEdge(table.get(9), table.get(8));
		myG.insertEdge(table.get(10), table.get(8));

		// to show the Graph created
		System.out.println("\n*** Graph created ***");
		myG.showGraph();
		
		// Traverse Graph in BFS & DFS
		System.out.println("\n*** BFS *** ");
		System.out.println("--- Start from : "+ "1 ");
		myG.BFS(table.get(1));
		System.out.println("--- Start from : "+ "10 ");
		myG.BFS(table.get(10));
		
		
		System.out.println("\n*** DFS *** ");
		System.out.println("--- Start from : "+ "1 ");
		myG.DFS(table.get(1));
		System.out.println("--- Start from : "+ "10 ");
		myG.DFS(table.get(10));
		
	}

}
