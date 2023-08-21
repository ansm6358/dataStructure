package midTermExam;

import java.util.NoSuchElementException;

public class MTEarrayList<T> {
	int capacity = 3;
	T [] dataArray;
	int arraySize;
	
	public MTEarrayList() {
		dataArray = (T[]) new Object [capacity];
		arraySize = 0;
	}
	
	public void add(T item) {
		// 여기에 크기가 부족하면 enlargeCapacity()를 호출하여 공간을 확보하고, 
		// 가장 뒤에 item을 삽입하도록 코드를 완성하시오.
		if(capacity <= arraySize) {
			enlargeCapacity();
		} 
			dataArray[arraySize] = item;
			arraySize++;
			
		
		
	}	
	
	private void enlargeCapacity() {
		// dataArray 공간을 2배로 늘려주는 코드를 완성하시오.
		T[] bigArray=(T[]) new Object[capacity*2];
		System.arraycopy(dataArray, 0, bigArray, 0, arraySize);
		dataArray = bigArray;
		capacity *=2;

		
	}
	
	public T get(int index) {
		if (index<0||index>=arraySize)
			throw new ArrayIndexOutOfBoundsException();
		return dataArray[index];
	}
	
	public int indexOf(T item) {
		// 여기에 임의의 T type 값을 같은지 비교하여 인덱스를 return하는 코드를 작성하시오
		// 같은 값이 없을 경우는 NoSuchElementException()을 발생시킵니다.
		for(int i=0; i<arraySize; i++) {
			if(item.equals(dataArray[i])) {
				return i;
				}
		}

		throw new NoSuchElementException();
		
		
		
	}
	
	public int sizeOf() {
		return arraySize;
	}
	
	public String toString() {
		String retString = "";
		for (int i = 0; i<arraySize; i++) {
			
			retString += ("["+i+"] : "+dataArray[i].toString()+"\n");
		}
		return retString;
	}
}
