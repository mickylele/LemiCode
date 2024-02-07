package ct01;

/**
 * 問題: 与えられた二つの整数 a と b の和、差、積、商（整数除算）、余りを計算するJavaプログラムを作成してください。
 * 
 * 入力: 二つの整数 a と b 。
 * 
 * 出力: 以下の形式で a と b の和、差、積、商、余りを出力してください。
 * 
 * 和: a + b
 * 
 * 差: a - b
 * 
 * 積: a * b
 * 
 * 商: a / b
 * 
 * 余り: a % b
 * 
 * 
 * 
 * 例:
 * 
 * 入力: a=15, b=4
 * 
 * 出力:
 * 
 * 和: 19
 * 
 * 差: 11
 * 
 * 積: 60
 * 
 * 商: 3
 * 
 * 余り: 3
 */
public class Sample5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 15;
		int b = 4;
		System.out.println("和:" + (a + b));
		System.out.println("差:" + (a - b));
		System.out.println("積:" + (a * b));
		System.out.println("商:" + (a / b));
		System.out.println("余り:" + (a % b));

	}

}
