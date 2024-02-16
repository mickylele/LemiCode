package ct05;

public class Test29 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = new int[] { 1, 3, 20, 4, 1, 0, 18, 2 };
		for (int i = 1; i < array.length - 1; i++) {
			if (array[i - 1] < array[i] && array[i] > array[i + 1]) {
				System.out.println(array[i]);

			}
		}

	}

}
