package midTermExam;

import java.util.Arrays;

public class MTEsimpleGraph {
	
	MTEarrayList<MTElinkedList>	aGraph = new MTEarrayList<>();
	int numberOfVertex = 0;
	int numberOfEdge = 0;
	
	public void createGraph(int inputSize, int[][] input) {
		// ���� 7. ���⿡ input�� �� ���� MTElinkedList�� �����,
		// �̸� MTEarrayList<MTElinkedList>�� aGraph�� �߰��ϴ�
		// �ڵ带 �ϼ��Ͻÿ�.
		MTEarrayList<MTElinkedList> aGraph = new MTEarrayList<MTElinkedList>();
		MTElinkedList linked = new MTElinkedList();
		for(int xi = 0; xi<inputSize; xi++) {
			for(int yi = 0; yi<inputSize; yi++) {
				
					aGraph.dataArray[xi].add(yi); 
				
			}
		}

		
		
		
		
		
		
	}
	public int numEdge() {
		return numberOfEdge;
	}
	
	public int numVertex() {
		return numberOfVertex;
	}	
	
	public MTElinkedList traverse(int u) {
		int [] visited = new int [numberOfVertex];
		Arrays.fill(visited,  0);
		MTElinkedList tempStack = new MTElinkedList();
		MTElinkedList result = new MTElinkedList();
		tempStack.add(u);
		depthFirst(visited, tempStack, result);
		return result;
	}
			
	private void depthFirst(int [] visited, MTElinkedList st, MTElinkedList result) {
		while (st.sizeOf()>0) {
		// ���� 8. ���⿡ MTElinkedList�� ���� Stack�� ������ ������������ 
		// �ϳ��� ������ �̹� �湮�� ��尡 �ƴϸ� visited ǥ�⸦ �ϰ� ��� ����Ʈ�� �߰��ϸ�, 
		// �ڽſ��� ����� ������ �����ͼ� Stack�� �־��ִ� �۾��� �ݺ��ϴ� �ڵ带 �ϼ��Ͻÿ�. 

			
			
			
			
			
			
		}
	}
	
	public int longestRun(int [] eachRun) {
		int maxCount=0;
		int [] visited = new int[numberOfVertex];
		for (int i=0; i<numberOfVertex;i++) {
			Arrays.fill(visited, 0);
			eachRun[i] = countVertex(i, visited);
			if (maxCount<eachRun[i])
				maxCount= eachRun[i];
		}
		return maxCount;
	}

	private int countVertex(int v, int[] visited) {
		// ���� 9. "��� v�κ����� ���� �� ����� ���̴� v�� ������ ��� u�� ���� ��
		// 1+��� u�κ����� ���� �� ����� ����" ���� �����ϴ� �ڵ带 �ϼ��Ͻÿ�.

		
		
		
		


	}
	
	public String toString() {
		return aGraph.toString();
	}
}
