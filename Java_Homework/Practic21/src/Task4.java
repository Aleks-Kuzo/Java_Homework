import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void printFirstFiveFiles(String directoryPath) {
        File dir = new File(directoryPath);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Каталог не найден");
            return;
        }

        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("Каталог пустой");
            return;
        }

        List<String> fileNames = new ArrayList<>();
        for (File file : files) {
            fileNames.add(file.getName());
        }

        int count = Math.min(5, fileNames.size());
        System.out.println("Первые " + count + " файлов:");
        for (int i = 0; i < count; i++) {
            System.out.println(fileNames.get(i));
        }
    }

    public static void main(String[] args) {
        printFirstFiveFiles(".");
    }
}