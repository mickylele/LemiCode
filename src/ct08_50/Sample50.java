package ct08_50;

/**
 * Employee」という基底クラスを作成し、その派生クラスとして「Manager」を作成します。
 * 「Employee」クラスには「name（名前）」と「salary（給料）」のフィールドがあり、「Manager」クラスには「department（部門）」のフィールドが追加されます。
 * それぞれのクラスに適切なコンストラクタとメソッドを実装し、継承の概念を示してください。 入力: なし（この問題では、特定の入力は必要ありません。） 出力:
 * Managerオブジェクトを作成し、その詳細（名前、給料、部門）を表示します。 例: 名前：山田太郎 給料：500000 部門：IT部門 名前:
 * 山田太郎, 給料: 500000 部門: IT部門
 */
public class Sample50 {

	public static void main(String[] args) {

		Manager manager = new Manager();

		manager.setName("名前：山田太郎");
		manager.setSalary("給料：500000");
		manager.setDepartment("部門：IT部門");

		System.out.println(manager.name);
		System.out.println(manager.salary);
		System.out.println(manager.department);
	}

}
