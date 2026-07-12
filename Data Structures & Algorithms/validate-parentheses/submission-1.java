class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();

        stack.push('x');

        for (int i = 0; i < array.length; i++){
            switch (array[i]){
                case '(':
                    stack.push(array[i]);
                    break;
                case '{':
                    stack.push(array[i]);
                    break;
                case '[':
                    stack.push(array[i]);
                    break;
                case ')':
                    if (stack.peek() != '(') {
                        return false;
                    }
                    stack.pop();
                    break;
                case '}':
                    if (stack.peek() != '{') {
                        return false;
                    }
                    stack.pop();
                    break; 
                case ']':
                    if (stack.peek() != '[') {
                        return false;
                    }
                    stack.pop();
                    break;       
            }
        }
        if (stack.peek() == 'x') {
            return true;
        }
        return false;
    }
}
