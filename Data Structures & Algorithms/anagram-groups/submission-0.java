class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String word : strs) {
            char[] wordCharArray = word.toCharArray();
            Arrays.sort(wordCharArray);
            String sortedAnagram = new String(wordCharArray);
            res.putIfAbsent(sortedAnagram, new ArrayList<>());
            res.get(sortedAnagram).add(word);
        }
        return new ArrayList<>(res.values());
    }

}
