package ct05;

import java.util.Scanner;

/**
 * キーボードから6つの整数を入力し、それらを配列に格納した後、配列の中で最大値と最小値を見つけて出力するプログラムを書いてください
 * 。最大値と最小値が同じ値であれば、その値を一度だけ出力します。
 * 最大値と最小値が異なる値で、それぞれの値が複数存在する場合でも、各値を一度だけ出力します。
 * 入力:
 * ランダムに入力された6つの整数。
 * 出力:
 * 配列の最大値と最小値（重複の同値があっても一度だけ出力）。
 * 例1:
 * 入力: 5 7 33 7 1 9 出力: 33 1
 * 例2:
 * 入力: 5 5 6 6 6 5 出力: 6 5
 */

public class Sample23 {

	public static void main(String[] args) {
		
		//  キーボードから入力対象の声明
		Scanner scanner = new Scanner(System.in);
		// 長さが６の配列を声明
		int[] array = new int[6];
	    // キーボードから6つの整数を入力し、それらを配列に格納した
		for(int i=0;i<array.length;i++) {
			// キーボードから入力した整数を一つずつ配列に格納します。
			array[i] = scanner.nextInt();
		}
		// 最大値変数の初期化
		int max = array[0];
		// 最小値変数の初期化
		int min = array[0];

		//配列の中で最大値と最小値を見つけて
		for(int i=1;i<array.length;i++) {
			// 配列の中で最大値を見つけて
			if(array[i]>max) {
				max=array[i];
			}
			// 配列の中で最小値を見つけて
			if(array[i]<min) {
				min=array[i];
			}	
		}
		// 最大値と最小値が同じ値であれば、その値を一度だけ出力します。
		if(max==min) {
			System.out.println(max);
		}else {
		// 最大値と最小値が異なる値で、それぞれの値が複数存在する場合でも、各値を一度だけ出力します。
			System.out.println(max);
			System.out.println(min);
		}
		scanner.close();
		

	}

}
