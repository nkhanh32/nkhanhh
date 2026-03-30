public class Solution {

	public static long fibonacci(long n) {
		if (n<0) {
			return -1;
		}
		if (n==0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}
		long a=0;
		long b=1;
		long rs=0;
		for (int i=2; i<=n; i++) {
			if (b>Long.MAX_VALUE - a) {
				return Long.MAX_VALUE;
			}
			rs=a+b;
			a=b;
			b=rs;
		}
		return rs;
	}
	public static void main(String[] args) {
		System.out.println("Fibonacci(-10)="+Solution.fibonacci(-10));
		System.out.println("Fibonacci(0)="+Solution.fibonacci(0));
		System.out.println("Fibonacci(1)="+Solution.fibonacci(1));
		System.out.println("Fibonacci(5)="+Solution.fibonacci(5));
		System.out.println("Fibonacci(10)="+Solution.fibonacci(10));
		System.out.println("Fibonacci(23908419)="+Solution.fibonacci(23908419));
	}
} 