package ct07_47;

/**
 * 動物園の動物を管理するシステムを設計してください。このシステムでは、動物（Animal）クラスと動物園（Zoo）クラスの2つが必要です。
 * Animalクラスには、種類（species）、年齢（age）、健康状態（healthStatus）といったプライベート属性を設定します。
 * Zooクラスでは、動物を配列で管理し、動物を追加、表示するメソッドを実装します。配列のサイズは固定であるため、最大動物数を設定してください。
 * 入力:
 * myZoo.addAnimal(new Animal("ライオン", 5, "健康")); myZoo.addAnimal(new Animal("ゾウ", 10, "病気")); 
 * 出力:
 * ライオン (年齢: 5, 健康状態: 健康) ゾウ (10, 健康状態: 病気)
 */
public class Sample47 {

	public static void main(String[] args) {

		Zoo myZoo = new Zoo();
		
		myZoo.addAnimal(new Animal("ライオン", 5, "健康"));
		myZoo.addAnimal(new Animal("ゾウ", 10, "病気"));
		
		
	
	}

}
