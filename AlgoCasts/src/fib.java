import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Fibonacci problem

public class fib {
	public static void main(String[]args) {
		Long codePath = fibonacci(4);
		System.out.println(codePath + " ");
//		int result = Fib5(3);
//		int r = Fib2(5);
//		int l = FibMemoized(5);
//		System.out.print(result + " ");
//		System.out.print("\n");
//		System.out.print(r + " ");
//		System.out.print("\n");
//		System.out.print(l + " ");
	}
	public static Long fibonacci(int n) {
        ArrayList<Long> fibSeq = new ArrayList<Long>();
        fibSeq.add(1L);
        fibSeq.add(1L);
        for(int i = 2; i < n; i++){
            fibSeq.add(fibSeq.get(i-1) + fibSeq.get(i-2));
        }
        return fibSeq.get(n-1);
    }
	
	//Iterative solution
	public static int Fib(int n ) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(0);
		result.add(1);
		for(int i = 2; i <= n; i++){
			result.add(result.get(i-1) + result.get(i-2));
		}
		return result.get(n);
	}
	public static int Fib5(int n ) {
		int[] result = new int[n+1];
		result[0] = 0;
		if(n > 0) {
			result[1] = 1;
			for(int i = 2; i <= n; i++){
				result[i] = result[i-1] + result[i-2];
			}
		}
		return result[n];
	}

	//Recursive solution
	public static int Fib2(int n ) {
		if(n < 2) {
			return n;
		}
		return Fib2(n-1) + Fib2(n-2);

	}

	//recursion with memoization
	public static int FibMemoized(int n ) {
		Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
		int result = 0;

		if(n < 2) {
			return n;
		}
		if(cache.containsKey(n)) {
			return cache.get(n);
		}else {
			result = Fib2(n-1) + Fib2(n-2);
			cache.put(n, result);
		}
		return result;
	}
}
