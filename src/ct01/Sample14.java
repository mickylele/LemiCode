package ct01;

/**
 * 数列9、99、999...9999999999の和を計算するJavaプログラムを書いてください。
 * この数列は各項が前の項に10を掛けて9を加えることで生成されます。ループを使用してこの数列を生成し、同時に和を求めてください。
 * 入力:
 * この問題では入力は必要ありません。
 * 出力:
 * 計算された数列の和。
 * 例:
 * 出力: 数列の和の数値
 */
public class Sample14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long sum = 0;
		long num = 9;
		//i代表循环次数
		for (int i = 0; i <= 10; i++) {
			sum +=num;
			//将当前数字累加到总和中,这里就是0+9=9
			
			num=num*10+9;
			//第一次循环9*10+9，90*10+9.。。。。
			
			
		}
		System.out.println(sum);

	}

}