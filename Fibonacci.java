package recursive;

public class Fibonacci  {

	public static void main(String[] args) {
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
		
		
		int step=10;
		
		
		//fib(step);
		
		for (int i = 0; i <=step; i++) {
			System.out.print(fib(i)+" ");
		}
		

	}

	private static int fib(int a) {
	if(a==0) return 0;
	if(a==1) return 1;
		
	return fib(a-1)+fib(a-2);	
	}

}
