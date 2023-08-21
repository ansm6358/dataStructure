package midTermExam;

import java.util.Arrays;

public class MTEsimpleGraph {
	
	MTEarrayList<MTElinkedList>	aGraph = new MTEarrayList<>();
	int numberOfVertex = 0;
	int numberOfEdge = 0;
	
	public void createGraph(int inputSize, int[][] input) {
		// 문제 7. 여기에 input의 각 행을 MTElinkedList로 만들고,
		// 이를 MTEarrayList<MTElinkedList>인 aGraph에 추가하는
		// 코드를 완성하시오.
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
		// 문제 8. 여기에 MTElinkedList로 만든 Stack에 내용이 없어질때까지 
		// 하나를 꺼내서 이미 방문한 노드가 아니면 visited 표기를 하고 결과 리스트에 추가하며, 
		// 자신에게 연결된 노드들을 가져와서 Stack에 넣어주는 작업을 반복하는 코드를 완성하시오. 

			
			
			
			
			
			
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
		// 문제 9. "노드 v로부터의 가장 긴 경로의 길이는 v에 인접한 노드 u가 있을 때
		// 1+노드 u로부터의 가장 긴 경로의 길이" 임을 구현하는 코드를 완성하시오.

		
		
		
		


	}
	
	public String toString() {
		return aGraph.toString();
	}
}
