package Easy;

import java.util.Arrays;

public class ReverseAString {
	static void main() {
		char[] s = { 'M', 'A', 'N', 'I', 'S', 'H' };
		reverseString(s, 0, s.length - 1);
		System.out.println(Arrays.toString(s));
	}

	static void reverseString(char[] arr, int s, int e) {
		if (s > e) {
			return;
		}
		// swap start with end

		char tempValue = arr[s];
		arr[s] = arr[e];
		arr[e] = tempValue;

		reverseString(arr, s + 1, e - 1);
	}
}
