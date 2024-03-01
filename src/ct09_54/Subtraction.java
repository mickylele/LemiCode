package ct09_54;

public class Subtraction implements Calculate{

	@Override
	public void calculate(int i, int j) {

		System.out.println("除算:" + String.valueOf(i) + "/" + String.valueOf(j) + "=" + (i / j));

	}

}
