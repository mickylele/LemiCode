package ct02;

/**
 * 第三の変数を使用せずに、2つのint型変数の値を交換するJavaプログラムを書いてください。
 * 
 * 入力:
 * 
 * 変数aとbの値。
 * 
 * 出力:
 * 
 * 交換後の変数aとbの値。値の間には空白を入れてください。
 * 
 * 例:
 * 
 * 入力例: a = 5, b = 10
 * 
 * 出力例: 10 5
 */
public class Sample6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 5;
		int b = 10;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);

	}

}
