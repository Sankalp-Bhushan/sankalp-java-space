package JavaPracticeCodes;

import java.util.*;

import SortingAlgorithms.BucketSort;

public class Patterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		pattern1(n);
		pattern2(n);
		pattern3(n);
		pattern4(n);
		pattern5(n);
		pattern6(n);
		pattern7(n);
		pattern8(n);
		pattern9(n);
		pattern10(n);
		pattern11(n);
		pattern12(n);
		pattern13(n);
		pattern14(n);
		pattern15(n);
		pattern16(n);
		pattern17(n);
		pattern18(n);
		pascalsTriangle(n);
		pattern19(n);
		butterflyPattern(n);
		pattern20(n);

	}

	public static void pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern4(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern6(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern7(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern8(int n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			int spaces;
			if (i < n) {
				spaces = 2 * (n - i) - 1;
			} else {
				spaces = 2 * (i - n + 1) + 1;
			}
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * n - spaces; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern9(int n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			int spaces;
			if (i < n) {
				spaces = 2 * i + 1;
			} else {
				spaces = 2 * (2 * n - i) - 3;
			}
			for (int j = 0; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * n - spaces; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern10(int n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			int spaces;
			if (i < n) {
				spaces = 2 * i + 1;
			} else {
				spaces = 2 * (2 * n - i) - 3;
			}
			for (int j = 0; j <= spaces; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < 2 * n - spaces; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern11(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1) {
					System.out.print("* ");
				} else if (j == 0 || j == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern12(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				if (i == 0) {
					System.out.print("* ");
				} else if (i == n - 1) {
					System.out.print("* ");
				} else if (j == 0 || j == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern13(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (i == n - 1) {
					System.out.print("* ");
				} else if (j == 0 || j == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern14(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0) {
					System.out.print("* ");
				} else if (i == 0) {
					System.out.print("* ");
				} else if (j == 0 || j == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern15(int n) {
		// first outer loop to iterate through each loop
		for (int i = 0; i < n; i++) {

			// first inner loop to print leading whitespaces
			for (int j = 0; j < 2 * (n - i) - 1; j++) {
				System.out.print(" ");
			}

			// second inner loop to print alphabets and inner
			// whitespaces
			for (int k = 0; k < 2 * i + 1; k++) {
				if (k == 0 || k == 2 * i || i == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern16(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= n - i - 1; j++) {
				if (i == 0) {
					System.out.print("* ");
				} else if (j == 0 || j == n - i - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern17(int n) {
		int rows = 2 * n - 1;
		for (int i = 0; i < rows; i++) {
			int spaces;
			if (i < n) {
				spaces = n - i - 1;
			} else {
				spaces = i - n + 1;
			}
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= n - spaces - 1; j++) {
				if (j == 0 || j == n - spaces - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern18(int n) {
		int rows = 2 * n - 1;
		for (int i = 0; i < rows; i++) {
			int spaces;
			if (i < n) {
				spaces = i;
			} else {
				spaces = 2 * n - i - 2;
			}
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - spaces; j++) {
				if (i == 0 || i == rows - 1) {
					System.out.print("* ");
				} else if (j == 0 || j == n - spaces - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pascalsTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			int c = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(c + " ");
				c = c * (i - j) / j;
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern19(int n) {
		int rows = 2 * n - 1;
		int k = 0;
		boolean flag = true;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				if (j <= k || j >= rows - k - 1) {
					if (i % 2 == 0) {
						if (j % 2 == 0) {
							System.out.print("*  ");
						} else {
							System.out.print("   ");
						}
					} else {
						if (j % 2 == 0) {
							System.out.print("   ");
						} else {
							System.out.print("*  ");
						}
					}
				} else {
					System.out.print("   ");
				}
			}
			if (k >= n - 1) {
				flag = false;
			}
			if (flag) {
				k++;
			} else {
				k--;
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void butterflyPattern(int n) {
		int i, j;
		int num = 1;

		// outer loop to handle upper part
		for (i = 1; i <= n; i++) {
			// inner loop to print stars
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			// inner loop to print spaces
			int spaces = 2 * (n - i);
			for (j = 1; j <= spaces; j++) {
				System.out.print("  ");
			}

			// inner loop to print stars
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		// outer loop to handle lower part
		for (i = n; i >= 1; i--) {
			// inner loop to print stars
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			// inner loop to print spaces
			int spaces = 2 * (n - i);
			for (j = 1; j <= spaces; j++) {
				System.out.print("  ");
			}

			// inner loop to print stars
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static void pattern20(int n) {
//		using three loops
		int rows = 2 * n - 1;
		for (int i = 0; i < rows; i++) {
			int spaces = 0;
			if (i < n) {
				spaces = i;
			} else {
				spaces = rows - i - 1;
			}
			for (int j = 0; j < spaces; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						System.out.print("*  ");
					} else {
						System.out.print("   ");
					}
				} else {
					if (j % 2 == 0) {
						System.out.print("   ");
					} else {
						System.out.print("*  ");
					}
				}
			}
			for (int j = 0; j < rows - 2 * spaces; j++) {
				if (j == 0 || j == rows - 2 * spaces - 1) {
					System.out.print("*  ");
				} else {
					System.out.print("   ");
				}
			}
			for (int j = 0; j < spaces; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						System.out.print("*  ");
					} else {
						System.out.print("   ");
					}
				} else {
					if (j % 2 == 0) {
						System.out.print("   ");
					} else {
						System.out.print("*  ");
					}
				}
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

}
