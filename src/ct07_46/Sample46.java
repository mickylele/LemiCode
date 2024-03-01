package ct07_46;

/**
 * 車（Car）クラスを作成してください。このクラスには、最高速度（maxSpeed）と車種（model）という2つのプライベート属性が必要です。
 * カプセル化の原則に従い、これらの属性にアクセスするための公開メソッド（ゲッターとセッター）を実装してください。
 * 入力:
 * Car myCar = new Car(); myCar.setModel("Toyota"); myCar.setMaxSpeed(180); 出力:
 * 車種: Toyota 最高速度: 180km/h
 */
public class Sample46 {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.setModel("Toyota");
		
		myCar.setMaxSpeed(180);
		
		String out = "車種:"+myCar.getModel()+ " 最高速度:"+myCar.getMaxSpeed()+"km/h";
		
		System.out.println(out);
		
		Car1 myCar1 = new Car1("Toyota",180);
		
		String out1 = "車種:"+myCar1.getModel()+ " 最高速度:"+myCar1.getMaxSpeed()+"km/h";
		
		System.out.println(out1);
	}

}
