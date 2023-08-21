package MyList;

public class SimpleArrayList {

	int capacity = 3;
	String[] dataArray = new String[capacity];
	int size = 0;
	
	String get(int index) {
		if(index<0 || index > size-1) {
			return null;
		} else {
			return dataArray[index];
		}
		
	}
	void add(int index, String data) {
		if(index<0 || index > size) {
			return;
		}
		if(size == capacity) {			
			enlargeCapacity();
		} 
		for(int i = size-1; i>=index; i--) {
			dataArray[i+1]= dataArray[i];			
		}
		dataArray[index] = data;
		size++;
	}
	private void enlargeCapacity() {
		String[] bigArray= new String[capacity*2];
		System.arraycopy(dataArray, 0, bigArray, 0, size);
		dataArray = bigArray;
		capacity *=2;
	}
	String remove(int index) {
		if(index<0 || index > size) {
			return null;
		} 
		String val = dataArray[index];
		for(int i =index+1; i<size; i++) {
			dataArray[i-1] = dataArray[i];
		}
		dataArray[size-1]= dataArray[size];
		size--;
		return val;
	}
	boolean remove(String data) {
		int temp = indexOf(data);
		return (remove(temp)!=null);
	}
	int indexOf(String data) {
		for(int i=0; i<size; i++) {
			if(data==dataArray[i]) {
				return i;
				}
		}
		return -1;
	}
	int sizeOf() {
		return size;
	}

	public String toString() {
		String result = "";
		for(int i =0; i<size; i++) {
			result =result+ dataArray[i].toString()+ " ";
		}
		return result;
	}
}
