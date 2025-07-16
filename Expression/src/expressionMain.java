import java.util.Stack;

public class expressionMain {

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

    // Method to evaluate prefix expression
    public static int solvePrefix(String pre) {
        // Stack of operands
        Stack<Integer> s = new Stack<>();

        // Traverse prefix from right to left
        for (int i = pre.length() - 1; i >= 0; i--) {
            char sym = pre.charAt(i);

            if (Character.isDigit(sym)) {
                // Convert to int and push to stack
                s.push(Integer.parseInt(Character.toString(sym)));
            } else {
                // Pop two operands
                int a = s.pop();
                int b = s.pop();

                // Calculate and push result
                int c = calc(a, b, sym);
                s.push(c);
            }
        }

        return s.pop();
    }

    // Main method for testing
    public static void main(String[] args) {
        String prefix = "+5*-+94/86-$173";  // Example: same as postfix reversed
        int result = solvePrefix(prefix);
        System.out.println("Result: " + result);
    }
} 

 