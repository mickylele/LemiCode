package ct06;

import java.util.Arrays;

/**
 * 二つの整数配列を受け取り、それらを一つの配列に結合し、新しい配列として返すメソッドconcatenateArraysを作成してください。
 * forループを使用して結合処理を行い、mainメソッドでこのメソッドを呼び出し、結果をコンソールに出力してください。
 * 入力: 二つの整数配列（例: [1, 2, 3] と [4, 5, 6]）
 * 出力: 結合された新しい配列（例: [1, 2, 3, 4, 5, 6]）
 * 例:
 * 入力: [10, 20, 30] と [40, 50, 60] 出力: [10, 20, 30, 40, 50, 60]
 */
public class Sample44 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array1= {10, 20, 30};
		
		int[]array2= {40, 50, 60};
		
		int[]result=concatenateArrays(array1,array2);
		
		System.out.println(Arrays.toString(result));
    

	}

	public static int[] concatenateArrays(int[] array1,int[] array2) {
		
		int[] newArray= new int[array1.length+array2.length];
		
		int index =0;
		
		for(int i=0;i<array1.length;i++,index++) {
			
			newArray[index]=array1[i];
		}
		for(int j =0;j<array2.length;j++,index++) {
			
			newArray[index] = array2[j];
		}
			
		return newArray;
		
	}
}
