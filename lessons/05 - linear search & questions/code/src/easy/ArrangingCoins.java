package easy;

public class ArrangingCoins {
    public static void main(String[] args) {
        /*
        You have n coins ,and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly I ,coins. The last row of the staircase may be incomplete.

        Given the integer n, return the number of complete rows of the staircase you will build.

        Example :
        Input: n = 8
        Output: 3
        Explanation: Because the 4th row is incomplete, we return 3.
         */

        int coins = 5;
        System.out.println(stairs(coins));
    }

    static int stairs(int coins) {
        int rows = 0;

        for (int i = 1; i < coins; i++) {
//            System.out.println("i : " + i);
//            System.out.println("coins : " + coins);
            rows += 1;
            coins -= i;
        }

        return rows;
    }
}
