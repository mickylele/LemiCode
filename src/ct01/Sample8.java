package ct01;

import java.util.Scanner;
public class Sample8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		
		double discount = 1.0;
		
		if(amount>=5000) {
			discount=0.6;	
		}else if(amount>=2000) {
			discount=0.7;
		}else if(amount>=500) {
			discount=0.8;
		}else if(amount>=100) {
			discount=0.9;
			
		}
		int finalAmount = (int)(amount*discount);
		System.out.println(finalAmount);

		scanner.close();
	}

}
