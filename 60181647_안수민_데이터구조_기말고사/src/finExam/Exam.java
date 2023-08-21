package finExam;

import java.util.ArrayList;

public class Exam {
	
	ArrayList<Character> table;
	int inputNumber;
	
	public static void main(String[] args) {
		
		int numberOfInput=10;
		char [] data = {'m','y','u','n','g','j','i','d','h','k'};
		
		// return ������ ArrayList<Character> type�� heap table�� �����ֵ���
		// HEAP class�� ����ÿ�. (���� �ڵ� �̿��Ͽ� ���� ���� ����)
		// �� �ʿ��� method�� inserthHeap �ϳ����̹Ƿ�, �ٸ� method�� ������ ����
		Heap myheap = new Heap();
		ArrayList<Character> table = new ArrayList<Character>();
		// to make Heap with input data array 'data[]'
		for (int i=0; i<numberOfInput; i++)
			table = myheap.insertHeap(data[i]);
		// to print out Heap
		System.out.println("*** Heap Contents (index-order) "); 
		for (int i=0; i<numberOfInput; i++)
			System.out.print((i+1)+" : "+table.get(i+1)+ "  "); 
		
		// array�� ����� complete binary tree�� input���� �޾Ƽ�
		// preorder, inorder, postorder ������ ���� ����ϵ���
		// TreeTraverseInArray class�� ����ÿ�.
		// �ּ��� preorder, inorder, postorder�� ������ method�� �����ؾ��ϸ�,
		// �ٸ� method�� ������ ����
		
		TreeTraverseInArray me = new TreeTraverseInArray (table);
		// to print out Tree Traverse results 
		System.out.println("\n*** Preorder Traverse");
		me.preorder(1);
		System.out.println("\n*** Inorder Traverse");
		me.inorder(1);
		System.out.println("\n*** Postorder Traverse");
		me.postorder(1);
		System.out.println();
		
		// ������ character array�� vertex�� array�� �̿��մϴ�.
		// ������ ���� insertVertex, insertEdge, BFS, DFS, showGraph�� 
		// 5���� method�� �����ϴ�  Graph class�� ����ÿ� (�����ڵ� �̿� ����)
		// ���� ����� adjacent matrix�� adjacent list �� ���ϴ� ����� ����.  
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
