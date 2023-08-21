package finExam;

import java.util.ArrayList;

public class TreeTraverseInArray {

	private ArrayList<Character> tree = new ArrayList<Character>();
	
	public TreeTraverseInArray(ArrayList<Character> table) {
		tree = table;
	}

	public void preorder(int i) {
		if(tree.size()>i) {
			System.out.print((i)+" : "+tree.get(i)+ "  ");
			preorder(i*2);
			preorder(i*2+1);
		}
	}

	public void inorder(int i) {
		if(tree.size()>i) {
			inorder(i*2);
			System.out.print((i)+" : "+tree.get(i)+ "  ");
			inorder(i*2+1);
		}
	}

	public void postorder(int i) {
		if(tree.size()>i) {
		postorder(i*2);
		postorder(i*2+1);
		System.out.print((i)+" : "+tree.get(i)+ "  ");
		}
	}

}
