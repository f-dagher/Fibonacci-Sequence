import java.util.*;

public class fibSeq {
	

	public static void main(String[] args) {
	
		int end = 21;
		
		for (int i = 1; i <= end; i++)
		{
			System.out.println("i =" + i + ": " + fib(i));
		}
		
	}
	
	public static int fib(int n) {
		if (n <= 1)
		{
			return n;
		}
		
		return fib(n -1) + fib(n-2);
	
	}

}
