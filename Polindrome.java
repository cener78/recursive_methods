package recursive;

public class Polindrome {

	public static void main(String[] args) {
		String str = "Adanada";

		// reverse(str);

		String Pstr=reverse(str);
		
		if(str.equals(Pstr)) {
			System.out.println(str+"is polindrome");
		}else {
			System.out.println(str+"is not polindrome");
		}
	}

	private static String reverse(String str) {

		if (str.isEmpty())
			return str;
		return reverse(str.substring(1)) + str.charAt(0);
	}

}
