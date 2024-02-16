package ct06;

/**
 * 与えられた年が閏年（リープイヤー）かどうかを判定するメソッドisLeapYearを作成してください。 入力: 年（例: 2020） 出力:
 * 閏年かどうかの真偽値（例: true） 例: 入力: 2024 出力: true
 */

public class Sample41 {

	public static void main(String[] args) {

		int year = 2024;

		if (isLeapYear(year)) {

			System.out.println("true");

		} else {
			System.out.println("false");
		}

	}

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {

			return true;

		} else {

			return false;

		}

	}

}
