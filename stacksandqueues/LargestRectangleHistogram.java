package stacksandqueues;

import java.util.Stack;

public class LargestRectangleHistogram {
    public int largestRectangleArea(int[] heights) {
       
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

        while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
            int height = heights[stack.pop()];
            int right = i;
            int left = (stack.isEmpty() ? -1 : stack.peek());
            int area = height * (right - left - 1);
            maxArea = Math.max(area, maxArea);
        }
        stack.push(i);
        }

        return maxArea;
    }
}
