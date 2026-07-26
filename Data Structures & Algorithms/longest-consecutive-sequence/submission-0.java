class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int count = 0;
        if (nums.length > 0) {
            result = 1;
            count = 1;
        } else return result;


        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            if ((nums[j] - nums[i]) == 1) {
                count ++;
                if (count > result) {
                    result = count;
                }
                continue;
            } else if (nums[j] == nums[i]) {
                continue;
            }
            count = 1;
        }
    return result;
    }
}
