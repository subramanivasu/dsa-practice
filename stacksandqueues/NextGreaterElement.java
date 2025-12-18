package stacksandqueues;

import java.util.Stack;

public class NextGreaterElement {
    public int[] nextLargerElement(int[] arr) {
        int[] result = new int[arr.length];
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = arr.length-1; i>=0; i--) {
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i]=-1;
                stack.push(arr[i]);
            } else {
                result[i]=stack.peek();
                stack.push(arr[i]);
            }
        }    
        return result;
    }
}
