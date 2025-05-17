import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {
	final static String input = "input.txt";
	final static String output = "output.txt";
	final static long mod = 1_000_000_007;
	final static int mini = Integer.MIN_VALUE;
	final static int maxi = Integer.MAX_VALUE;

	static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static long power(long a, long b) {
		long res = 1;
		while (b-- > 0)
			res = (res % mod * a % mod) % mod;
		return res;
	}

	static long ncr(long n, long r) {
		if (r > n - r)
			r = n - r;
		long[] C = new long[(int) r + 1];
		C[0] = 1;
		for (int i = 1; i <= n; i++) {
			for (long j = Math.min(i, r); j > 0; j--)
				C[(int) j] = (C[(int) j] + C[(int) j - 1]) % mod;
		}
		return C[(int) r];
	}

	static boolean isPrime(long n) {
		if (n <= 1)
			return false;
		else if (n == 2)
			return true;
		else if (n % 2 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static int countSetBits(int n) {
		int count = 0;
		while (n > 0) {
			n &= (n - 1);
			count++;
		}
		return count;
	}

	static int digits(long n) {
		int count = 0;
		long temp = n;
		while (temp > 0) {
			temp /= 10;
			count++;
		}
		return count;
	}

	static boolean isPalindrome(long i) {
		long originalNum = i;
		long remainder;
		long reversedNum = 0;
		while (i != 0) {
			remainder = i % 10;
			reversedNum = reversedNum * 10 + remainder;
			i /= 10;
		}
		return originalNum == reversedNum;
	}

	static long lcm(long a, long b) {
		return (a / gcd(a, b)) * b;
	}

	static void sort(long[] a) {
		ArrayList<Long> l = new ArrayList<>();
		for (long value : a) {
			l.add(value);
		}
		Collections.sort(l);
		for (int i = 0; i < l.size(); i++)
			a[i] = l.get(i);
	}

	static void sort(int[] a) {
		ArrayList<Integer> l = new ArrayList<>();
		for (int value : a) {
			l.add(value);
		}
		Collections.sort(l);
		for (int i = 0; i < l.size(); i++)
			a[i] = l.get(i);
	}

	static void reverse(int[] arr) {
		int l = 0;
		int h = arr.length - 1;
		while (l < h) {
			swap(arr, l, h);
			l++;
			h--;
		}
	}

	static String reverse(String s) {
		StringBuilder res = new StringBuilder(s);
		return res.reverse().toString();
	}

	static long fact(long n) {
		long res = 1, i;
		for (i = 2; i <= n; i++)
			res *= i;
		return res;
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() throws FileNotFoundException {
			br = new BufferedReader(new FileReader(input));
		}

		String n() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nint() {
			return Integer.parseInt(n());
		}

		long nlong() {
			return Long.parseLong(n());
		}

		double ndouble() {
			return Double.parseDouble(n());
		}

		int[] narr(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nint();
			return a;
		}

		int[][] narr(int n, int m) {
			int[][] a = new int[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					a[i][j] = nint();
			return a;
		}

		String nline() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	static class Pair {
		int x, y;

		Pair(int a, int b) {
			this.x = a;
			this.y = b;
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(output);
		// int tt = sc.nint();
		int tt = 1;
		while (tt-- > 0) {
			int n = sc.nint();
			int[] arr = sc.narr(n);
			sort(arr);
			int count1 = 0;
			for (int i = 0; i < n; i++) {
				if (2 * arr[i] >= arr[n - 1]) {
					break;
				} else
					count1++;
			}
			int count2 = 0;
			for (int i = n - 1; i >= 0; i--) {
				if (arr[i] <= 2 * arr[0]) {
					break;
				} else
					count2++;
			}
			out.println(Math.min(count1, count2));
		}
		out.flush();
		out.close();
	}
}