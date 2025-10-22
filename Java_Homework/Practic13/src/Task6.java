import java.io.*;
import java.util.*;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя файла: ");
        String fileName = reader.readLine();

        Scanner fileScanner = new Scanner(new File(fileName));
        StringBuilder input = new StringBuilder();
        while (fileScanner.hasNext()) {
            input.append(fileScanner.nextLine()).append(" ");
        }
        fileScanner.close();

        String[] words = input.toString().trim().split("\\s+");
        String result = getLine(words);
        System.out.println("Результат: " + result);
    }

    public static String getLine(String... words) {
        if (words == null || words.length == 0) return "";

        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();
        result.add(wordList.remove(0)); // начинаем с первого слова

        while (!wordList.isEmpty()) {
            boolean found = false;
            char lastChar = Character.toLowerCase(result.get(result.size() - 1).charAt(result.get(result.size() - 1).length() - 1));

            for (int i = 0; i < wordList.size(); i++) {
                char firstChar = Character.toLowerCase(wordList.get(i).charAt(0));
                if (firstChar == lastChar) {
                    result.add(wordList.remove(i));
                    found = true;
                    break;
                }
            }
            if (!found) break;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            if (i > 0) sb.append(" ");
            sb.append(result.get(i));
        }
        return sb.toString();
    }
}