package easy;

public class smallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'f';
        System.out.println(nextGreatestLetter(arr,target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (letters[middle] <= target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return letters[start % letters.length];
    }
}
