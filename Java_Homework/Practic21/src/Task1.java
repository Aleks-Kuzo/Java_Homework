import java.util.*;

public class Task1 {
    public static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T item : array) {
            list.add(item);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] strings = {"Hello", "World", "Java"};
        List<String> stringList = arrayToList(strings);
        System.out.println("Список строк: " + stringList);

        Integer[] numbers = {1, 2, 3, 4, 5};
        List<Integer> numberList = arrayToList(numbers);
        System.out.println("Список чисел: " + numberList);
    }
}