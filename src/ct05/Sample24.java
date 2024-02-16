package ct05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * キーボードから6つの整数を入力し、それらを配列に格納した後、まず配列を正順で出力し、次に配列を逆順にして出力するプログラムを書いてください。
 * 入力:
 * ランダムに入力された6つの整数。
 * 出力:
 * 最初に配列の正順での出力、次に配列を逆順にして出力（Arrays.toStringメソッドを使用）。
 * 例:
 * 入力: 1 32 3 4 55 6 出力: 正順: [1, 3, 4, 6, 32, 55] 逆順: [55, 32, 6, 4, 3, 1]
 */
public class Sample24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[6];
		
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(array));
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]<array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(array));
		
		scanner.close();
	}

}
