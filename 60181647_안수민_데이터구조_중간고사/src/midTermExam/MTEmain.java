package midTermExam;

public class MTEmain {

	public static void main(String[] args) {

		// Test of Matrix path
		System.out.println("[ No. 3 ]\n=============================================");
		int matrixSize = 6;
		int mSize=6;
		int [][] matrix = {
				{1,2,1,5,8,4},
				{4,1,9,4,2,3},
				{8,5,4,3,8,2},
				{1,5,3,5,7,3},
				{4,7,7,9,2,8},
				{2,4,6,3,1,4}
		};
		MTEMatrix m = new MTEMatrix(mSize, matrix);
		m.minPath1(5,5);
		m.minPath2(5,5);
		System.out.println(m.infoString());
		
		// Test of MTElinkedList
		System.out.println("[ No. 5 ]\n=============================================");
		MTElinkedList intList = new MTElinkedList ();
		for (int i=6; i>=0; i--)
			intList.add(i);
		System.out.println("test of add-method : \n"+ intList.toString()+"\n"+
		 "Size = "+ intList.sizeOf());
		System.out.println("test of get-method : "+ intList.get(3));
		System.out.println("test of indexOf-method : "+ intList.indexOf(5));
		System.out.println("=============================================");

			
		// Test of MTEarrayList<T>
		System.out.println("[ No. 6 ]\n=============================================");
		MTEarrayList<String> stringArray = new MTEarrayList<>();
		stringArray.add("aaa");
		stringArray.add("bbb");
		stringArray.add("ccc");
		System.out.println("test of add-method : \n"+ stringArray.toString()+"\n"+
		 "Size = "+ stringArray.sizeOf());
		stringArray.add("ddd");
		System.out.println("test of capacity-enlargement : Current Size ="+ stringArray.sizeOf());
		System.out.println("test of get-method : "+ stringArray.get(3));
		System.out.println("test of indexOf-method : "+ stringArray.indexOf("ccc"));
		System.out.println("=============================================");

		// Test of MTEsimpleGraph Creation
		System.out.println("[ No. 7 ]\n=============================================");
		int inputSize = 10;
		int [][] input = {{0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
						  {1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
						  {0, 1, 0, 0, 0, 1, 0, 0, 0, 1},
						  {0, 1, 1, 0, 0, 0, 0, 1, 0, 0},
						  {0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
						  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
						  {1, 1, 0, 0, 0, 1, 0, 0, 0, 0}, 
						  {0, 1, 0, 0, 0, 0, 0, 0, 1, 0}, 
						  {1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, 
						  {1, 1, 0, 0, 0, 1, 0, 0, 0, 0} 
						  };
		MTEsimpleGraph g = new MTEsimpleGraph();
		g.createGraph(inputSize, input);
		System.out.println("Number of Vertices : "+g.numVertex());
		System.out.println("Number of Edges : "+g.numEdge());
		System.out.println("Whole Graph : \n"+g.toString());
		System.out.println("=============================================");

		// Test of MTEsimpleGraph Traversal
		System.out.println("[ No. 8 ]\n=============================================");
		int vNum =0;
		System.out.println("Traversal from vertex # "+vNum+" : "+g.traverse(vNum).toString());
		vNum =6;
		System.out.println("Traversal from vertex # "+vNum+" : "+g.traverse(vNum).toString());
		vNum =5;
		System.out.println("Traversal from vertex # "+vNum+" : "+g.traverse(vNum).toString());
		System.out.println("=============================================");

		// Test of MTEsimpleGraph Longest Run 
		System.out.println("[ No. 9 ]\n=============================================");
		int [] runsForEach = new int [inputSize];
		System.out.println("Vertices in Longest Run : "+g.longestRun(runsForEach));
		for (int i=0; i<inputSize; i++)
			System.out.println("from vertex "+i+" : "+runsForEach[i] );
		System.out.println("=============================================");
		
		
	}

}
