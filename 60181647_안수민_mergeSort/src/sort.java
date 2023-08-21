
public class sort {

	public static void main(String[] args) {
		int A[] = {66, 53, 9, 46, 38, 13, 94, 76};
		System.out.print("처음 배열: ");
		showArray(A);
		
		A=mergeSort(A, 0, A.length-1);
		System.out.print("최종 배열: ");
		showArray(A);
	}

	private static void showArray(int[] A) {
		System.out.print("{ ");
		for(int i = 0; i<A.length; i++) {
		System.out.print(A[i]+" ");
	}		
		System.out.println("}");
	}

	private static int[] mergeSort(int[] A, int first, int last) {		
			
		if(first<last) {
			int mid = (first+last)/2;	
			 A=mergeSort(A, first, mid);
			 A=mergeSort(A, mid+1, last);		
			 A=merge(A,first,mid,last);
			 showArray(A);
	}
		return A;

}

	private static int[] merge(int[] A, int first, int mid, int last) {
		int[] temp = new int[A.length];
		int left = first;
		int right = mid+1;
		int tempNum = first;
		
		while(left<=mid && right<=last) {
			if(A[left]<A[right]) {
				temp[tempNum] = A[left];
				System.out.println(left+"번째 배열에 있는 "+A[left]+"를" +tempNum+"번째에 삽입");
				tempNum++;
				left++;
			} else {
				temp[tempNum] = A[right];
				System.out.println(right+"번째 배열에 있는 "+A[right]+"를" +tempNum+"번째에 삽입");
				tempNum++;
				right++;
			}
		}
		
		if(left>mid) {   //한 쪽만 남는 부분 넣는 용도 
			while(right<=last) {
				temp[tempNum] = A[right];
				System.out.println(right+"번째 배열에 있는 "+A[right]+"를" +tempNum+"번째에 삽입");
				tempNum++;
				right++;
			}
		} else {
			while(left<=mid) {
			temp[tempNum] = A[left];
			System.out.println(left+"번째 배열에 있는 "+A[left]+"를" +tempNum+"번째에 삽입");
			tempNum++;
			left++;
			}
		}
		
		while(first<=last) {
			A[first] = temp[first];
			first++;
		}
		return A;

	}
}