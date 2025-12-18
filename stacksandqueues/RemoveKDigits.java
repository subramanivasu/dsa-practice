package stacksandqueues;

import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String nums, int k) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < nums.length(); i++) {
            char digit = nums.charAt(i);
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while (!stack.isEmpty() && k > 0) {
            stack.pop();
            k--;
        }

        if (stack.isEmpty()) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        while (result.length() > 0 && result.charAt(result.length() - 1) == '0') {
            result.deleteCharAt(result.length() - 1);
        }

        result.reverse();

        if (result.isEmpty()) {
            return "0";
        }

        return result.toString();
    }
}
