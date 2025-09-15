package easy;

public class MinimumCostToMoveChips {
    public static void main(String[] args) {
        // Example input
        int[] chips = {2, 2, 2, 3, 3};

        // Count how many chips are at even and odd positions
        int evenCount = 0;
        int oddCount = 0;

        for (int chip : chips) {
            if (chip % 2 == 0) {
                // chip is at an even position
                evenCount++;
            } else {
                // chip is at an odd position
                oddCount++;
            }
        }

        // The cost is the smaller of the two groups,
        // because we must move the smaller group across parity
        int minCost = Math.min(evenCount, oddCount);

        System.out.println("Minimum cost to move all chips to the same position = " + minCost);
    }
}
