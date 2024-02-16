package ct06;

/**
 * 与えられた基数と指数から累乗を計算するメソッドpowerを作成してください。
 * 入力: 基数と指数（例: 2, 3）
 * 出力: 累乗の結果（例: 8）
 * 例:
 * 入力: 5, 2 出力: 25
 */
public class Sample40 {
	public static long power(int a,int b) {
		long sum=1;
		for(int i =0;i<b;i++) {
			sum*=a;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long sum = power(3,4);
		System.out.println(sum);

	}

}
