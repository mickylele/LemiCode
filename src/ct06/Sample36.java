package ct06;

/**
 * フィボナッチ数列の第n項を返すメソッドfibonacciを作成してください。
 * フィボナッチ数列は、0と1で始まり、以降の各項は前の2項の和となります（例：0, 1, 1, 2, 3, 5, ...）。
 * このメソッドは再帰を使用しないでください。
 * 入力: 整数n（例: 5）
 * 出力: フィボナッチ数列の第n項（例: 5）
 * 例:
 * 入力: 6 出力: 8
 */

public class Sample36 {
	
	public static void fibonacci(int n) {
		// 始まり変数の初期化
		int a = 0;
		int b = 1;
		// 整数n<1
		if(n<=1) {
			System.out.println("フィボナッチ数列の第"+n+"項: " + n);
		}else {
			// フィボナッチ数列の第n項の計算
			for(int i=2;i<=n;i++){
				int next = a + b;
	            a = b;
	            b = next;
			}
			System.out.println("フィボナッチ数列の第6項: " + b);
		}
		
	}

	public static void main(String[] args) {
		// フィボナッチ数列の第n項を返すメソッドの呼び出す
		fibonacci(6);
		
		

	}

}
