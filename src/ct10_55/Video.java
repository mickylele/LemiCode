package ct10_55;

public class Video extends Media implements Playable{

	public Video(String title, int length) {
		super(title, length);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public void displayInfo() {

		System.out.println("ビデオ「" + super.title + "」, 長さ: " + super.length + "分");
	
	}
	 public void play() {
			System.out.println("再生中: "+ title);
		}

	
}
