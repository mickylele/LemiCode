package ct09_54;

public class Division implements Calculate{

	@Override
	public void calculate(int i, int j) {

		System.out.println("減算:" + String.valueOf(i) + "-" + String.valueOf(j) + "=" + (i - j));

	}

}
