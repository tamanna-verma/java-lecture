
public class Fibonacci {
	public static int fib(int n) {
		
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		int n=8;
		int x=fib(n);
		System.out.println(x);

	}

}
