package Easy;

public class SumOfNumbers {
	static void main() {
		int n = 12345;
		int ans = SumofNumbers(n);
		System.out.println(ans);
	}

	static int SumofNumbers(int n) {
		if (n == 0) {
			return 0;
		}
		return (n % 10 + SumofNumbers(n / 10));
	}
}
