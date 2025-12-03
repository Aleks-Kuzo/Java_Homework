public class Task2 {
    public static void main(String[] args) {
        Integer[] nums = {10, 20, 30};
        GenericArray<Integer> intArray = new GenericArray<>(nums);
        intArray.printArray();

        String[] words = {"Java", "Python", "PHP"};
        GenericArray<String> strArray = new GenericArray<>(words);
        strArray.printArray();
    }
}