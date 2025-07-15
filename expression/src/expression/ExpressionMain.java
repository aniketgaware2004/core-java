package expression;

import java.util.Stack;

public class ExpressionMain {

    // Method to calculate based on operator
    public static int calc(int a, int b, char op) {
        switch (op) {
            case '$': return (int) Math.pow(a, b);   
            case '*': return a * b;
            case '/': return a / b;
            case '%': return a % b;
            case '+': return a + b;
            case '-': return a - b;
        }
        return 0;
    }

    // Method to evaluate postfix expression
    public static int solvePostfix(String post) {
        // Stack of operands
        Stack<Integer> s = new Stack<>();

        // Traverse postfix from left to right
        for (int i = 0; i < post.length(); i++) {
            // Get each character
            char sym = post.charAt(i);

            // If it's an operand
            if (Character.isDigit(sym)) {
                // Convert to int and push to stack
                String operand = Character.toString(sym);
                s.push(Integer.parseInt(operand));
            } else {
                // Pop two operands from stack
                int b = s.pop();
                int a = s.pop();

                // Perform operation and push result
                int c = calc(a, b, sym);
                s.push(c);
            }
        }

        // Final result
        return s.pop();
    }

    // Main method for testing
    public static void main(String[] args) {
        String postfix = "59+4862/-*173-$+";  // Sample postfix expression
        int result = solvePostfix(postfix);
        System.out.println("Result: " + result);
    }
}
