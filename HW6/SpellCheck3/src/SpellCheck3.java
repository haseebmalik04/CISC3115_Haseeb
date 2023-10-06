import java.io.*;
import java.util.Scanner;

class Dictionary {
    private String[] words;

    public Dictionary(String fileName) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File(fileName));
        int wordCount = 0;
        while (fileScanner.hasNext()) {
            wordCount++;
            fileScanner.next();
        }
        fileScanner.close();
        this.words = new String[wordCount];
        fileScanner = new Scanner(new File(fileName));
        int currentIndex = 0;
        while (fileScanner.hasNext()) {
            words[currentIndex] = fileScanner.next().toLowerCase();
            currentIndex++;
        }
    }

    public boolean isWordFound(String x) {
        for (int i = 0; i < words.length; i++) {
            if (x.toLowerCase().equals(words[i])) {
                return true;
            }
        }
        return false;
    }
}

public class SpellCheck3 {
    public static void main(String[] args) throws FileNotFoundException {
        Dictionary customDictionary = new Dictionary("Dictionary");
        int lineCount = 0;
        Scanner fileScanner = new Scanner(new File("paper"));
        while (fileScanner.hasNextLine()) {
            lineCount++;
            String currentLine = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(currentLine);
            while (lineScanner.hasNext()) {
                String currentWord = lineScanner.next();
                if (!customDictionary.isWordFound(currentWord)) {
                    System.out.printf("Line %4d: %s\n", lineCount, currentWord);
                }
            }
        }
    }
}
