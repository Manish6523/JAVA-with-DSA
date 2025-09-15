public class RichestCustomerWealth {
    public static void main(String[] args) {
        /*
        You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
        A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
        Example 2:

        Input: accounts = [[1,5],[7,3],[3,5]]
        Output: 10
        Explanation:
        1st customer has wealth = 6
        2nd customer has wealth = 10
        3rd customer has wealth = 8
        The 2nd customer is the richest with a wealth of 10.
        */

        int[][] accounts = {{1,5},{7,3},{3,5}};

        int[] ans = wealth(accounts);
        System.out.println("The " + ans[0] + " place customer is the richest with a wealth of "+ ans[1]);
    }

    static int[] wealth(int[][] arr){
        int[] output = new int[2];
        int maxWealth = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if(sum > maxWealth){
                maxWealth = sum;
                output[1] = maxWealth;
                output[0] = i+1;
            }
        }

        return output;
    }
}
