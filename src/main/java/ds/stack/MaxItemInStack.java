package ds.stack;

import java.util.Stack;

public class MaxItemInStack {

    public static int getMax(Stack<Integer> stack) {

        Stack<Integer> maxStack = new Stack<>();
        int max = stack.peek();
        while(!stack.isEmpty()) {
            int val = stack.pop();
            if(val > max) {
                max = val;
            }
            maxStack.push(max); //keep pushing the max item  in the stack
        }
        return maxStack.peek();
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(8);
        stack.push(23);
        stack.push(1);

        System.out.println(getMax(stack));


    }

}
