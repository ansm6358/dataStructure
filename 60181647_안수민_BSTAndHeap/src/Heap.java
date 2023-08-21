import java.util.ArrayList;

public class Heap {

	private ArrayList<Character> heap = new ArrayList<Character>();
	
	public Heap() {
		heap.add(null); //인덱스 0을 없애기 위함
	}
	
	public boolean isEmpty() {
		if(heap.size()==1) {
			return true;
		} else {
			return false;
		}
	}
	
	public int sizeOff() {
		return heap.size()-1;
	}
	
	public ArrayList<Character> insertHeap(char x){
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
	
	public Character deleteHeap() {
		if(heap.size()==1) {
			return null;
		}
		char returnVal = heap.get(1);
		if(heap.size()==2) {
			heap.remove(1);
		} else {
			heap.set(1, heap.remove(heap.size()-1));
			makeHeap(1);
		}
		return returnVal;
	}
	
	private void makeHeap(int index) {
		if(2*index >= heap.size() || (2*index+1)>=heap.size()) {
			return;
		}
		int k = 2*index;
		if(k+1<heap.size() && heap.get(k+1)>heap.get(k)) { //바꿀 위치가 오른쪽일 경우 그 인덱스가 k+1이기 떄문에 더해줌
			k++;
		}
		if(heap.get(k)>heap.get(index)) {
			char temp = heap.get(k);
			heap.set(k, heap.get(index));
			heap.set(index, temp);
			makeHeap(k);
		} else{
			return;
		}
	}

	public static void main(String[] args) {
		Heap myheap = new Heap();
		
		myheap.insertHeap('V');
		myheap.insertHeap('D');
		myheap.insertHeap('F');
		myheap.insertHeap('G');
		myheap.insertHeap('A');
		myheap.insertHeap('J');
		myheap.insertHeap('K');
		myheap.insertHeap('E');
		myheap.insertHeap('A');
		
		while(myheap.isEmpty() == false) {
			System.out.println(myheap.deleteHeap()+" ");
		}
	}

}
