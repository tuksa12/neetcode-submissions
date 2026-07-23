class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = (digits.length - 1); i >= 0; i--) {
            if (i == 0 && digits[i] == 9) {
                int[] newArray = new int[digits.length + 1];
                newArray[0] = 1;
                digits[i] = 0;
                System.arraycopy(digits, 0, newArray, 1, digits.length);
                return newArray;
            } else if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        return digits;
    }
}
