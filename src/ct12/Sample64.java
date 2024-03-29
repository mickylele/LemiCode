package ct12;

/**
 * 「招待状生成」クラスを作成し、参加者の名前とイベントの日付を含む招待状のテキストを生成する機能を含めてください。
 * 参加者の名前とイベントの日付は引数としてメソッドに渡され、フォーマットされた招待状の文字列を出力します。
 * 招待状のフォーマットは「[名前]様、[日付]のイベントにご招待します。」とします。
 * 入力:
 * 参加者の名前とイベントの日付。
 * 出力:
 * フォーマットされた招待状の文字列。
 * 例:
 * 入力: 名前 - "山田太郎", 日付 - "2023年4月1日"
 * 出力: "山田太郎様、2023年4月1日のイベントにご招待します。"
 */
public class Sample64 {

	public static void main(String[] args) {

		String name = "山田太郎";
		String date = "2023年4月1日";
		
		String invitation = String.format("%s様、%sのイベントにご招待します。",name, date);
		System.out.println(invitation);
	}

}
