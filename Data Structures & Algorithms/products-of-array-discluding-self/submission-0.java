class Solution {
    public int[] productExceptSelf(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> list  = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list = IntStream.of(nums).boxed()
                                    .collect(Collectors.toList());
            list.remove(i);
            map.put(i, list);
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < map.size(); i++) {
            int calc = map.get(i).stream().reduce(1, (a, b) -> a * b);
            result[i] = calc;
        } 
        return result;
    }
}  
