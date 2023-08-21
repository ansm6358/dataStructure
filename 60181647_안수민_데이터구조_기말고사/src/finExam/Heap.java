package finExam;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Character> heap = new ArrayList<Character>();
	
	public Heap() {
		heap.add(null);
	}
	
	public ArrayList<Character> insertHeap(char x) {
		int k = heap.size();
		heap.add(k,x);
		int parentIndex = (int) k/2;
		while(parentIndex > 0) {
			if(x<heap.get(parentIndex)) {
				return heap;
			} else {
				heap.set(k, heap.get(parentIndex));
				heap.set(parentIndex, x);
				k = parentIndex;
				parentIndex = (int) k/2;
			}
		}
		return heap;
	}

}
