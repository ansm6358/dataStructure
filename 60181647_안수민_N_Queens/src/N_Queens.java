import java.util.Arrays;

public class N_Queens {
	private static int n = 4;
	private static int[] settingRow = new int[n];

	public static void main(String[] args) {
		doQueen(0);
		System.out.println("����: "+ Arrays.toString(settingRow));

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
						System.out.println("��� ��찡 �ȵǹǷ� ������ ���� �ٲ�");
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
				System.out.println((row+1)+ "��° ��(" +(row+1)+","+column+")�� " + (i +1)+ "��° ���� �� �ߺ�");
				return false;
			} else if (column == settingRow[i] + diagonal) {
				System.out.println( (row+1)+ "��° ��(" +(row+1)+","+column+")�� " + (i +1)+ "��° ���� �밢�� �ߺ�");
				return false;
			}

		}
		return true;

	}

}
