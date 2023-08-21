import java.util.Arrays;

public class sort {
	
	public static void main(String[] args) {
		int[] data = {66, 53, 13, 46, 3, 38, 94, 76};
		int b = 0;
		int e = data.length-1;
		System.out.println("시작 배열:" + Arrays.toString(data));
		quickSort(data, b, e);
		System.out.println("최종 배열: "+ Arrays.toString(data));
	}
	private static void quickSort(int[] data, int b, int e) {
		int mid;
		if(e-b==1) {
			if(data[e]<data[b]) {
				int t = data[e];
				data[e]=data[b];
				data[b]=t;
			}
		} else if(e>b) {
			mid = partition(data, b, e);
			if(mid<0) {
				return;
				}
				quickSort(data, b, mid-1);
				quickSort(data, mid+1, e);
			}
	}
	private static int partition(int[] data, int b, int e) {
		int[] tmp = new int[data.length];
		int pivot = data[(b+e)/2];
		int standard = (b+e)/2;
		int f=b;
		int r=e;
		
		for(int i1=b; i1<standard; i1++) { 
			if(data[i1]<=pivot) {
				tmp[f++]=data[i1];
			} else {
				tmp[r--] = data[i1];
			}
		}
		
		for(int i2=e; i2>standard; i2--) {
			if(data[i2]<=pivot) {
				tmp[f++]=data[i2];
			} else {
				tmp[r--] = data[i2];
			}
		}

		if(f!=r) {
			System.out.println("wrong partition index..");
			return -1;
		} else {
			tmp[f] = pivot;
			for(int i= b; i <=e; i++) {
				data[i]=tmp[i];}
				System.out.println("partition position: "+f+ " pivot : "+ pivot);
				System.out.println(Arrays.toString(data));
				return f;
			}

	}


	
}
