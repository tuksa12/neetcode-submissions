class Solution {
    public boolean isPalindrome(String s) {
        char[] word = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        
        for (int i = 0; i < word.length; i ++) {
            if (word[i] != word[word.length-1-i]) {
                return false;
            }
        }
        return true;
    }
}
