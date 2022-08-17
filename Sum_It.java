package recursive;

public class Sum_It {

	public static void main(String[] args) {
		int max = 5;
		// [5 ~ 10]

		System.out.println(sumIt(max));

	}

	private static int sumIt(int a) {
		if (a < 0) { return 0;}
		
		
		return a + sumIt(a - 1);
	}

}
