package ct09_54;

public class Multiplication implements Calculate{

	@Override
	public void calculate(int i, int j) {

		System.out.println("乗算:" + String.valueOf(i) + "*" + String.valueOf(j) + "=" + (i * j));

	}

}
