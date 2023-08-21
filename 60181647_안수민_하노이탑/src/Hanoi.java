import java.util.ArrayList;
import java.util.Scanner;

public class Hanoi {

	private ArrayList<Integer> T[];

	
	@SuppressWarnings("resource")
	public void start() {
		int num;
		System.out.println("하노이탑 갯수를 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> T[]= new ArrayList[3];
		this.T = T;
		this.T[0] = new ArrayList<Integer>();
		this.T[1] = new ArrayList<Integer>();
		this.T[2] = new ArrayList<Integer>();
		
		num = scanner.nextInt();
		
		if(num<1) {
			System.out.println("양수를 입력해 주세요.");
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
            System.out.println(this.T[outputTower].get(lastNum) + "를 " + (outputTower+1) + "번 타워에서 " + (inputTower+1) + "번 타워로 옮깁니다.");
            System.out.print("1번 타워:"+this.T[0]+"   ");
            System.out.print("2번 타워:"+this.T[1]+"   ");
            System.out.println("3번 타워:"+this.T[2]);
            this.T[inputTower].add(this.T[outputTower].get(lastNum)); 
          this.T[outputTower].remove(lastNum);
          
		}else{
           	   moveT(num-1, outputTower, inputTower,  stayTower);
           	lastNum = this.T[outputTower].size()-1;
            System.out.println(this.T[outputTower].get(lastNum) + "를 " + (outputTower+1) + "번 타워에서 " + (inputTower+1) + "번 타워로 옮깁니다.");
            System.out.print("1번 타워:"+this.T[0]+"   ");
            System.out.print("2번 타워:"+this.T[1]+"   ");
            System.out.println("3번 타워:"+this.T[2]);
            this.T[inputTower].add(this.T[outputTower].get(lastNum)); 
          this.T[outputTower].remove(lastNum);
                  moveT(num-1, stayTower, outputTower,  inputTower );
              }
	}

}
