package ct06;

import java.util.Arrays;

public class MethodTest {

	public static void main(String[] args) {
		
		System.out.println(123);
		
		System.out.println("NNLNL");
		
		int[] array = new int[] { 1, 33, 334, 6, 32, 55 };
		
		int[] result = sort(array);
		xx();
		System.out.println(Arrays.toString(result));
	}
	
	/**
	 * ソート処理
	 * @param array 配列
	 * @return array 配列
	 */
	public static int[] sort(int[] array) {
		
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length -1; j++) {
				
				if(i == j) {
					continue;
				}
				int temp = 0;
				if(array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		return array;
	}
	
	public static void xx() {
		System.out.println("SSSSSSSSS");
	}
	

}
