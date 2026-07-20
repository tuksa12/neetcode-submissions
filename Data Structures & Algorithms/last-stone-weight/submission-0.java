class Solution {
    public int lastStoneWeight(int[] stones) {
        while (stones.length > 1) {
            Arrays.sort(stones);


            int n = stones.length;
            int stone0 = stones[n-1];
            int stone1 = stones[n-2];

            if (stone0 == stone1) {
                stones = Arrays.copyOfRange(stones, 0, n-2);
            } else {
                stones[n - 2] = stone0 - stone1;
                stones = Arrays.copyOfRange(stones, 0, n - 1);
            }
        }

        if (stones.length == 0) return 0;
        else return stones[0];
    }
}
