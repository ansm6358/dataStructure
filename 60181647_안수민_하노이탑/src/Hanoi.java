import java.util.ArrayList;
import java.util.Scanner;

public class Hanoi {

	private ArrayList<Integer> T[];

	
	@SuppressWarnings("resource")
	public void start() {
		int num;
		System.out.println("�ϳ���ž ������ �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> T[]= new ArrayList[3];
		this.T = T;
		this.T[0] = new ArrayList<Integer>();
		this.T[1] = new ArrayList<Integer>();
		this.T[2] = new ArrayList<Integer>();
		
		num = scanner.nextInt();
		
		if(num<1) {
			System.out.println("����� �Է��� �ּ���.");
		} else {
			for(int i = num; i>0; i--) {
				this.T[0].add(i);
			}
			int outputTower = 0;
			int stayTower = 1;
			int InputTower = 2;
			
			moveT(num, outputTower,stayTower,InputTower);
		}
		
	}

	private void moveT(int num, int outputTower, int stayTower, int inputTower) {
		int lastNum = 0;
		if(num==1){
			lastNum = this.T[outputTower].size()-1;
            System.out.println(this.T[outputTower].get(lastNum) + "�� " + (outputTower+1) + "�� Ÿ������ " + (inputTower+1) + "�� Ÿ���� �ű�ϴ�.");
            System.out.print("1�� Ÿ��:"+this.T[0]+"   ");
            System.out.print("2�� Ÿ��:"+this.T[1]+"   ");
            System.out.println("3�� Ÿ��:"+this.T[2]);
            this.T[inputTower].add(this.T[outputTower].get(lastNum)); 
          this.T[outputTower].remove(lastNum);
          
		}else{
           	   moveT(num-1, outputTower, inputTower,  stayTower);
           	lastNum = this.T[outputTower].size()-1;
            System.out.println(this.T[outputTower].get(lastNum) + "�� " + (outputTower+1) + "�� Ÿ������ " + (inputTower+1) + "�� Ÿ���� �ű�ϴ�.");
            System.out.print("1�� Ÿ��:"+this.T[0]+"   ");
            System.out.print("2�� Ÿ��:"+this.T[1]+"   ");
            System.out.println("3�� Ÿ��:"+this.T[2]);
            this.T[inputTower].add(this.T[outputTower].get(lastNum)); 
          this.T[outputTower].remove(lastNum);
                  moveT(num-1, stayTower, outputTower,  inputTower );
              }
	}

}
