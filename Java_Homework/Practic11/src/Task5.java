import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        int N = 50000;

        List<Integer> list1 = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            list1.add(i);
        }
        long time1 = System.currentTimeMillis() - start;

        List<Integer> list2 = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            list2.add(i);
        }
        long time2 = System.currentTimeMillis() - start;

        System.out.println("Добавление " + N + " элементов:");
        System.out.println("ArrayList: " + time1 + " мс");
        System.out.println("LinkedList: " + time2 + " мс");

        // --- Доступ по индексу (1000 раз) ---
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list1.get(N / 2);
        }
        time1 = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list2.get(N / 2);
        }
        time2 = System.currentTimeMillis() - start;

        System.out.println("Доступ по индексу:");
        System.out.println("ArrayList: " + time1 + " мс");
        System.out.println("LinkedList: " + time2 + " мс");

        start = System.currentTimeMillis();
        list1.contains(N - 1);
        time1 = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        list2.contains(N - 1);
        time2 = System.currentTimeMillis() - start;

        System.out.println("Поиск одного элемента:");
        System.out.println("ArrayList: " + time1 + " мс");
        System.out.println("LinkedList: " + time2 + " мс");
    }
}