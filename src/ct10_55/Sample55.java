package ct10_55;

/**
 * 「メディア」の抽象クラスと、インターフェース「再生可能」を作成します。
 * 抽象クラス「メディア」には、基本情報（例えば、タイトルや長さ）を格納する属性と、これらの情報を出力する抽象メソッドを含めてください。
 * インターフェース「再生可能」には、メディアを再生するメソッドを定義します。
 * 派生クラス「音楽」と「ビデオ」を作成し、これらのクラスで「メディア」クラスの抽象メソッドを実装し、「再生可能」インターフェースのメソッドをオーバーライドしてください。
 * 入力:
 * プログラムは特定の入力を必要としません。
 * 出力:
 * メディアの基本情報と、再生時のメッセージを出力します。
 * 例:
 * 音楽「Beethoven - Symphony No.9」, 長さ: 70分 再生中: Beethoven - Symphony No.9
 * ビデオ「Spirited Away」, 長さ: 125分 再生中: Spirited Away
 */
public class Sample55 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Music music = new Music("Beethoven - Symphony No.9",70);
		music.displayInfo();
		music.play();
		
		Video video = new Video("Spirited Away",125);
		video.displayInfo();
		video.play();

	}

}
