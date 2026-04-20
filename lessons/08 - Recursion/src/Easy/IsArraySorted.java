package Easy;

public class IsArraySorted {
	static void main() {
		// int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr = { 1, 3, 5, 2, 7 };
		System.out.println(isSorted(arr, 0));
	}

	static boolean isSorted(int[] arr, int s) {
		if (s == arr.length - 1) {
			return true;
		}
		return arr[s] <= arr[s + 1] && isSorted(arr, s + 1);
	}
}
