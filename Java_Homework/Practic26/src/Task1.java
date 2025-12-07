import java.util.Stack;

public class Task1 {
    public static void reverseArray(Object[] arr) {
        Stack<Object> stack = new Stack<>();
        for (Object item : arr) {
            stack.push(item);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("До: " + java.util.Arrays.toString(numbers));
        reverseArray(numbers);
        System.out.println("После: " + java.util.Arrays.toString(numbers));
    }
}