package ct10_57;

public class Smartlight extends Smartdevice implements Controllable {

	@Override
	void displayInfo() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("デバイス: " + deviceName);
		
	}

	@Override
	public void turnOn() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ライトをオンにしました。");
		
	}

	@Override
	public void turnOff() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ライトをオフにしました。");
	}

	
}
