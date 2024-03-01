package ct09_52;

/**
 * 「楽器」基底クラスと、その派生クラス「ギター」と「ピアノ」を作成します。
 * 基底クラスには抽象メソッドplay()を定義し、派生クラスでこのメソッドを実装してください。
 * それぞれの楽器で異なる音を出すようにし、多様性を示す簡単なプログラムを作成します。
 * 入力:
 * プログラムは特定の入力を必要としません。
 * 出力:
 * 各楽器の演奏音を出力します。
 * 例:
 * ギターはギターの音を出します。 
 * ピアノはピアノの音を出します。
 */
public class Sample52 {

	public static void main(String[] args) {

		Instrument[] instrument = new Instrument[2];
		instrument[0]=new Gitter();
		instrument[1] = new Piano();
		
		for (Instrument instrument1 : instrument) {
			instrument1.play();
        }
		
	}

}
