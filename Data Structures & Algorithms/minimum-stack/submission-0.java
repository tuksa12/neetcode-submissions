class MinStack {
    Stack<Integer> stack;
    List<Integer> numbers;
    public MinStack() {
        this.stack = new Stack<>();
        this.numbers = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.push(val);
        numbers.add(val);
    }
    
    public void pop() {
        int number = stack.pop();
        numbers.remove(Integer.valueOf(number));
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Collections.sort(numbers);
        return numbers.get(0);
    }
}
