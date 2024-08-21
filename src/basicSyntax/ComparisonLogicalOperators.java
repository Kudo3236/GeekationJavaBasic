package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 7;
		int b = 4;
		
		boolean isGreater = (a > b);
		
		System.out.println(isGreater);
		
		boolean isSunny = true;
		boolean isWarm = true;
		boolean andResult1 = (isSunny && isWarm);
		
		System.out.println(andResult1);
		
		int x = 2;
		int y = 6;
		boolean andResult2 = (x >= 0 && y % 2 == 0);
		
		System.out.println(andResult2);
		
		boolean hasPermission = false;
		
		System.out.println(!hasPermission);
		
		
	}

}
