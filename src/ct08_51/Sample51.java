package ct08_51;

/**
 * 「商品」基底クラスと、派生クラス「電子製品」と「食品」を作成します。
 * 基底クラスにはdisplay()メソッドを定義し、商品の基本情報を表示します。
 * 各派生クラスには特有の属性を追加し、display()メソッドをオーバーライドして商品の詳細情報を表示するようにします。
 * 入力:
 * プログラムは特定の入力を必要としません。
 * 出力:
 * 各商品の基本情報と詳細情報を出力します。
 * 例:
 * 商品名: iPhone, 価格: 80000円, 製造元: Apple
 * 商品名: チョコレート, 価格: 200円, 賞味期限: 2023年12月
 */
public class Sample51 {

	public static void main(String[] args) {

		Electronics items = new Electronics("iPhone",80000,"Apple");
		Food items1 = new Food("チョコレート",200,"2023年12月");
		items.display();
		items1.display();
		
		
		
	}

}
