package ct10_58;

public class Novel extends Book implements Borrowing {

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
		// TODO 自動生成されたメソッド・スタブ 小説タイトル: ノルウェイの森, 著者: 村上春樹, ISBN: 123456789
		System.out.println("小説タイトル: " + title + ", 著者: " + author + ", ISBN: " + isbnNumber);
	}

}
