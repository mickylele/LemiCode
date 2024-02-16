package ct05;

/**
 * Javaの main
 * メソッド内で、整数の配列が与えられた場合に、その配列のバランスポイントを見つけ出してください。
 * バランスポイントとは、配列の特定の位置で、その位置より前のすべての要素の合計と、その位置より後ろのすべての要素の合計が等しくなる点を指します。
 * 配列はハードコーディングされているものとします。バランスポイントが存在する場合はそのインデックスを、存在しない場合は -1 を出力してください。
 * 入力: 特に入力はありません。配列はコード内に直接定義されています。
 * 出力: バランスポイントのインデックスを出力してください。存在しない場合は -1 を出力してください。
 * 例:
 * 入力配列: {1, 2, 3, 4, 3, 2, 1} 出力: 3 (インデックス3での左側の合計(1+2+3)と右側の合計(3+2+1)が等しい)
 */

public class Sample31 {

	public static void main(String[] args) {
        int[] array = {10, 6, 3, 5, 3, 10};
        int totalSum = 0;
        int leftSum = 0;
        
        for (int num : array) {
            totalSum += num;
        }

        for (int i = 0; i < array.length; i++) {
            if (leftSum == totalSum - leftSum - array[i]) {
                System.out.println("バランスポイントのインデックス: " + i);
                return;
            }
            leftSum += array[i];
        }

        System.out.println("バランスポイントのインデックス: -1");
    }

}
