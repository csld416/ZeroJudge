	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.io.PrintWriter;
	import java.util.StringTokenizer;
	
	public class a915_2 {
	
		final static Scanner sc = new Scanner(System.in);
		static PrintWriter out = new PrintWriter(System.out);
		static int n;
		static {
			try {
				n = sc.nextInt();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		static set[] arr = new set[n];
	
		public static void main(String[] args) throws Throwable {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new set();
				arr[i].setA(sc.nextInt());
				arr[i].setB(sc.nextInt());
			}
			sort(arr, n);
			for (int i = 0; i < arr.length; i++) {
				out.append(arr[i].a + " " + arr[i].b);
				out.append("\n");
			}
			out.flush();
		}
	
		static void sort(set[] array, int n) {
			set temp = new set();
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (array[i].getA() > array[j].getA()) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
					if (array[i].getA() == array[j].getA()) {
						if (array[i].getB() > array[j].getB()) {
							temp = array[i];
							array[i] = array[j];
							array[j] = temp;
						}
					}
				}
			}
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
	
			public boolean hasNext(String s) throws Throwable {
				return (s = sc.nextLine()) != null && s.length() != 0;
			}
		}
	}
	
	class set {
		int a;
		int b;
	
	
		public int getA() {
			return a;
		}
	
		public void setA(int n) {
			this.a = n;
		}
	
		public int getB() {
			return b;
		}
	
		public void setB(int n) {
			this.b = n;
		}
	}