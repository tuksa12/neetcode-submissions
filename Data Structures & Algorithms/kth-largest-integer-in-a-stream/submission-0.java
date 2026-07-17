class KthLargest {
    List<Integer> nums;
    int k;
    public KthLargest(int k, int[] nums) {
        this.nums = Arrays.stream(nums)
                  .boxed()
                  .collect(Collectors.toCollection(ArrayList::new));
        this.k = k;
    }
    
    public int add(int val) {
        nums.add(val);
        return findKthLargest(nums);
    }

    public int findKthLargest(List<Integer> nums) {
        Collections.sort(nums, Comparator.reverseOrder());
        return nums.get(this.k-1);
    }
}
