package finExam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class Graph<T> {
	T [] inputData;
	int [][] adjacentMatrix;
	int maxNumberOfVertex;
	int numberOfVertex;
	int [] visited;
	
	public Graph(int n) {
		maxNumberOfVertex = n;
		numberOfVertex = 0;
		inputData = (T[]) (new Object[maxNumberOfVertex]);
		adjacentMatrix = new int[maxNumberOfVertex][maxNumberOfVertex];
		visited = new int[maxNumberOfVertex];
	}

	
	public void insertVertex(T v) {
		if(numberOfVertex>=maxNumberOfVertex) {
			return;
		}
		inputData[numberOfVertex] = v;
		numberOfVertex++;
		return;
	}

	public void insertEdge(T u, T v) {
		int i = indexOf(u);
		int j = indexOf(v);
		if(i==-1||j==-1) {
			return;
		}
		adjacentMatrix[i][j]=1;
		return;
	}
	private int indexOf(T u) {
		for(int i =0; i<numberOfVertex; i++) {
			if(inputData[i].equals(u)) {
				return i;
			}
		}
		return -1;
	}

	public void showGraph() {
		System.out.print("[ Vertics : Adjacent Matrix ]");
		for(int i=0; i<numberOfVertex; i++) {
			System.out.print("\n"+inputData[i]+": ");
			for(int j=0; j<numberOfVertex; j++) {
				System.out.print(adjacentMatrix[i][j]+" ");
			}
		}
		System.out.println();
	}

	public void BFS(T v) {
		Deque<Integer> que = new ArrayDeque<Integer>();
		Arrays.fill(visited, 0);
		que.add(indexOf(v));
		BFSRecursion(que);		
	}
	private void BFSRecursion(Deque<Integer> que) {
		while(que.peek()!=null) {
			int index = que.poll();
			if(visited[index]==1) {
				return;
			} else {
				System.out.println(inputData[index]);
				visited[index]=1;
				
				for(int i=0; i<numberOfVertex; i++) {
					if(adjacentMatrix[index][i]!=0) {
						que.add(i);
					}				
				}
				BFSRecursion(que);
			}
		}
		return;
	}
	public void DFS(T v) {
		Stack<Integer> st = new Stack<Integer>();
		Arrays.fill(visited, 0);
		st.push(indexOf(v));
		DFSRecursion(st);		
	}
	private void DFSRecursion(Stack<Integer> st) {
		while(st.size()>0) {
			int index=st.pop();
			if(visited[index]!=0) {
				return;
			}
			visited[index]=1;		
			for(int i=0; i<numberOfVertex; i++) {
				if(adjacentMatrix[index][i]!=0) {
					st.push(i);
					DFSRecursion(st);
				}
			}
			System.out.println(inputData[index]);
		}
	}
}
