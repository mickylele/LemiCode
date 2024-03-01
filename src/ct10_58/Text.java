package ct10_58;

public class Text  extends Book implements Borrowing{

	@Override
	public void borrow() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("小説を借りました。");
	}

	@Override
	public void returning() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("学術書を返却しました。");
	}

	@Override
	void bookInfo() {
		// TODO 自動生成されたメソッド・スタブ 学術書タイトル: 経済学の原理, 著者: マンキュー, ISBN: 987654321 
		System.out.println("学術書タイトル: " + title + ", 著者: " + author + ", ISBN: " + isbnNumber);
	}
}
