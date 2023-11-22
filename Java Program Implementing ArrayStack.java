public class ArrayStack {
    private static final int MAX_SIZE = 5;
    private int[] stackArray;
    private int top;
    public ArrayStack() {
        stackArray = new int[MAX_SIZE];
        top = -1; // Stack is initially empty
    }
    public boolean isEmpty() {
        return top == -1;
    }
  public boolean isFull() {
        return top == MAX_SIZE - 1;
    }
  public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow. Cannot push element " + element + ".");
        } else {
            stackArray[++top] = element;
            System.out.println("Element " + element + " pushed onto the stack.");
        }
    }  public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow. Cannot pop from an empty stack.");
        } else {
            int poppedElement = stackArray[top--];
            System.out.println("Element " + poppedElement + " popped from the stack.");
        }
    }
 public void peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty. Cannot peek at the top element.");
        } else {
            int topElement = stackArray[top];
            System.out.println("Top Element: " + topElement);
        }
    }  public void display() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }}}
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.pop();
        stack.display();

        stack.peek();

        stack.pop();
        stack.pop(); // Trying to pop from an empty stack

        stack.display();
    }
}
