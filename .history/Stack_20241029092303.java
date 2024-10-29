import java.util.Stack;
public class Stack {
    public static void main(String[] args) {
        // Create a Stack to store Integer elements
        Stack<Integer> stack = new Stack<>();

        // Push 10 elements onto the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        // Display the stack after adding elements
        System.out.println("Stack after adding 10 elements: " + stack);

        // Remove 4 elements from the stack
        for (int i = 0; i < 4; i++) {
            if (!stack.isEmpty()) {
                int removedElement = stack.pop();
                System.out.println("Removed element: " + removedElement);
            }
        }

        // Display the stack after removing 4 elements
        System.out.println("Stack after removing 4 elements: " + stack);
    }
}

