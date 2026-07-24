class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for (int i = 0; i < strs.size(); i++) {
            result += strs.get(i).length() + "#" + strs.get(i);
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int j = i;

            // Find the '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // Read the length
            int length = Integer.parseInt(str.substring(i, j));

            // Read exactly 'length' characters
            result.add(str.substring(j + 1, j + 1 + length));

            // Move to the next encoded string
            i = j + 1 + length;
        }

        return result;
    }
}
