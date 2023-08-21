import java.util.Arrays;

public class N_Queens {
	private static int n = 4;
	private static int[] settingRow = new int[n];

	public static void main(String[] args) {
		doQueen(0);
		System.out.println("최종: "+ Arrays.toString(settingRow));

	}

	private static boolean doQueen(int row) {
		boolean fin = false;
		row = row + 1;
		if (n != (row - 1)) {
			int column = 1;
			while (!fin) {
				if (column == n + 1) {
					return false;
				} else if (check(row - 1, column)) {
					settingRow[row - 1] = column;
					System.out.println(Arrays.toString(settingRow));
					fin = doQueen(row);
					if (!fin) {
						row = row - 1;
						column = settingRow[row - 1];
						settingRow[row] = 0;
						System.out.println("모든 경우가 안되므로 이전의 것을 바꿈");
						System.out.println(Arrays.toString(settingRow));
					}
				}
				column = column + 1;
			}
		} else {
			fin = true;
		}
		return fin;
	}

	private static boolean check(int row, int column) {
		for (int i = 0; i < row; i++) {
			int diagonal = row - i;
			if (column == settingRow[i]) {
				System.out.println((row+1)+ "번째 퀸(" +(row+1)+","+column+")이 " + (i +1)+ "번째 퀸과 열 중복");
				return false;
			} else if (column == settingRow[i] + diagonal) {
				System.out.println( (row+1)+ "번째 퀸(" +(row+1)+","+column+")이 " + (i +1)+ "번째 퀸과 대각선 중복");
				return false;
			}

		}
		return true;

	}

}
