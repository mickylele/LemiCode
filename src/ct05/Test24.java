package ct05;

import java.util.Arrays;

public class Test24 {

	public static void main(String[] args) {

		int[] array = new int[] { 33, 33, 4, 6, 32, 55 };
		
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length -1; j++) {
				//为什么i和j对比？
				if(array[j] == array[j+1]) {
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
		System.out.println(Arrays.toString(array));
	}

}
