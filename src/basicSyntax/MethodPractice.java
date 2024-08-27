package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 8;
		int b = 4;
		
		result(a, b);
	}
	
	//足し算
	public static int sumNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	//引き算
	public static int subNumbers(int a, int b) {
		int sub = a - b;
		return sub;
	}
	
	//掛け算
	public static int mulNumbers(int a, int b) {
		int mul = a * b;
		return mul;
	}
	
	//割り算
	public static int divNumbers(int a, int b) {
		int div = a / b;
		return div;
	}

	//出力
	public static void result(int a, int b) {
		String calculation = "計算結果は";
		String end = "です";
		
		System.out.println(calculation + sumNumbers(a, b) + end);
		System.out.println(calculation + subNumbers(a, b) + end);
		System.out.println(calculation + mulNumbers(a, b) + end);
		System.out.println(calculation + divNumbers(a, b) + end);
	}
}
