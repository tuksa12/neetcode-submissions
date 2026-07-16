class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                for (int k = 2; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> current = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        Collections.sort(current);
                        if (!result.contains(current) && i != j && j != k && i!= k) {
                            result.add(current);
                        }
                    }
                }
            }
        }
        return result;
    }
}
