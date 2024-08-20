package basicSyntax;

public class Calculation {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = x + y;
		String value1 = "変数";
		String value2 = "の値は";
		String value3 = "です";
		
		System.out.println(value1 + "z" + value2 + z + value3);
		
		double a = 5.25;
		a += 2.5;
		a *= 3.0;
		int b = (int)a;
		b += 10;
		
		System.out.println(value1 + "a" + value2 + a + value3);
		System.out.println(value1 + "b" + value2 + b + value3);
		
	}

}
