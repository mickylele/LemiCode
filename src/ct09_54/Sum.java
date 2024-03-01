package ct09_54;

public class Sum implements Calculate {

	@Override
	public void calculate(int i, int j) {

		System.out.println("加算:" + String.valueOf(i) + "+" + String.valueOf(j) + "=" + (i + j));

	}

}
