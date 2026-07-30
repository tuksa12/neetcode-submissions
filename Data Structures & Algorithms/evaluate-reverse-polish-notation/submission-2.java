class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Integer next;
        Integer current;
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "+":
                    next = stack.pop();
                    current = stack.pop();
                    stack.push(current + next);
                    break;
                case "-":
                    next = stack.pop();
                    current = stack.pop();
                    stack.push(current - next);
                    break;
                case "*":
                    next = stack.pop();
                    current = stack.pop();
                    stack.push(current * next);
                    break;
                case "/":
                    next = stack.pop();
                    current = stack.pop();
                    stack.push(current / next);
                    break;
                default:
                    stack.push(Integer.valueOf(tokens[i]));
                    break;
               
            }
        }
        return stack.pop();
    }
}
