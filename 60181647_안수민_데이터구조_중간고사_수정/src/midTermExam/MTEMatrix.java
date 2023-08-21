package midTermExam;

import java.util.Arrays;

public class MTEMatrix {

	static int size ;
	static int [][] matrix;
	static int [][] memo ;
	static int count1, count2;
	
	public MTEMatrix (int n, int[][] input) {
		size = n;
		matrix = input;
		memo = new int [size][size] ;
		count1=0;
		count2=0;
	}

	public static int minPath1(int x, int y) {
		count1++;
		// 여기에 최소 경로값을 갖는 재귀적 프로그램을 작성하시오
		if (x==0 && y==0) {
			return matrix[0][0];
			}
		else {
			if (x==0) {return matrix[x][y]+ minPath1(x,y-1);}
			else if (y==0) { return matrix[x][y]+ minPath1(x-1,y);
		
			}			
			else {
				int minPath = Math.min(minPath1(x-1,y), minPath1(x,y-1));
				return matrix[x][y]+ Math.min(minPath,minPath1(x-1, y-1));}
		}		
	}
	public static int minPath2(int x, int y) {
		count2++;
		// 여기에 재귀적 프로그램에 memoization을 적용한 프로그램을 작성하시오
		if (x==0 && y==0) {
			memo[x][y] = matrix[x][y];
			return memo[x][y];
		}
		else {
			if (memo[x][y]>0) {
				return memo[x][y];
			}
			else {
				if (x==0) {
					memo[x][y] = matrix[x][y] + minPath2(x,y-1);
				}
				else if (y==0) {
					memo[x][y] = matrix[x][y] + minPath2(x-1,y);
				
				}
				else {
					int minPath = Math.min(minPath2(x-1,y), minPath2(x,y-1));
				
					memo[x][y] =  matrix[x][y]+ Math.min(minPath,minPath2(x-1, y-1));
				}
				
				return memo[x][y];
				}
			}
		}

		
		
		
		
		
		
		
	
	public String infoString() {
		String returnStr="";
		returnStr +=("Recursion Count : "+count1+"\n");
		returnStr +=("Memoization Count : "+count2+"\n");
		for (int i=0;i<size;i++) {
			returnStr += "{";
			for (int j=0;j<size;j++)
				returnStr += (" "+memo[i][j]+" ");
			returnStr += "} \n";
		}
		return returnStr;
		
	}
}
