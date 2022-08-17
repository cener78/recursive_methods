package recursive;

public class ReserveString {

	public static void main(String[] args) {
		String str = "CENGIZ ERDEM";

		// reverse(str);

		System.out.println(reverse(str));
	}

	private static String reverse(String str) {

		if (str.isEmpty())
			return str;
		return reverse(str.substring(1)) + str.charAt(0);
	}

}
