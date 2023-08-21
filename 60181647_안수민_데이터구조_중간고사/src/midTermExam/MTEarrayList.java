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
		// ���⿡ ũ�Ⱑ �����ϸ� enlargeCapacity()�� ȣ���Ͽ� ������ Ȯ���ϰ�, 
		// ���� �ڿ� item�� �����ϵ��� �ڵ带 �ϼ��Ͻÿ�.
		if(capacity <= arraySize) {
			enlargeCapacity();
		} 
			dataArray[arraySize] = item;
			arraySize++;
			
		
		
	}	
	
	private void enlargeCapacity() {
		// dataArray ������ 2��� �÷��ִ� �ڵ带 �ϼ��Ͻÿ�.
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
		// ���⿡ ������ T type ���� ������ ���Ͽ� �ε����� return�ϴ� �ڵ带 �ۼ��Ͻÿ�
		// ���� ���� ���� ���� NoSuchElementException()�� �߻���ŵ�ϴ�.
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
