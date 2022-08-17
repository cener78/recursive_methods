package recursive;

public class Factorial {

	public static void main(String[] args) {
		int num = 6;
		int factorial=factorial(num);

		System.out.println(factorial);

	}

	// Recurisive Methods: call method inside the method

	private static int factorial(int num) {

		if (num <= 0)  return 1 ;
	
		return num * factorial(num - 1);
	}

}
