import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class b838 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	
	public static void solve() {

	}
	static long binomialCoeff(int n, int k)
    {
        long res = 1;
 
        // Since C(n, k) = C(n, n-k)
        if (k > n - k)
            k = n - k;
 
        // Calculate value of [n*(n-1)*---*(n-k+1)] / [k*(k-1)*---*1]
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
 
        return res;
    }
	 static long catalan(int n)
	    {
	        // Calculate value of 2nCn
	        long c = binomialCoeff(2 * n, n);
	 
	        // return 2nCn/(n+1)
	        return c / (n + 1);
	    }
	 
	    // Function to find possible ways to put balanced
	    // parenthesis in an expression of length n
	    static long findWays(int n)
	    {
	        // If n is odd, not possible to
	        // create any valid parentheses
	        if ((n & 1) != 0)
	            return 0;
	 
	        // Otherwise return n/2'th Catalan Number
	        return catalan(n / 2);
	    }
	public static void main(String[] args) throws Throwable{

	}
	
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
		public boolean hasNext(String s) throws Throwable{
			return (s = sc.nextLine()) != null && s.length() != 0;
		}
	}
}
