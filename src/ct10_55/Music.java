package ct10_55;

public class Music extends Media implements Playable{

	 public Music(String title, int length) {
		super(title, length);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	void displayInfo() {

		System.out.println("音楽「" + super.title + "」, 長さ: " + super.length + "分");
	
	}
	 public void play() {
			System.out.println("再生中: "+ title);
		}
}
