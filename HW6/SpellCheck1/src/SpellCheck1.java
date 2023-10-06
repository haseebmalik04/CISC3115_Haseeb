import java.io.*;
import java.util.Scanner;

class Dictionary {
    private String filename;

    public Dictionary(String filename) {
        this.filename = filename;
    }

    public boolean found(String a) throws FileNotFoundException {
        Scanner input = new Scanner(new File(this.filename));
        while (input.hasNext()) {
            if (input.next().toLowerCase().equals(a.toLowerCase())) {
                input.close();
                return true;
            }
        }
        input.close();
        return false;
    }
}

public class SpellCheck1 {
    public static void main(String[] args) throws FileNotFoundException {
        Dictionary dictionary = new Dictionary("Dictionary");
        int count = 0;
        Scanner inputFile = new Scanner(new File("paper"));
        while (inputFile.hasNextLine()) {
            count++;
            String line = inputFile.nextLine();
            Scanner wordScanner = new Scanner(line);
            while (wordScanner.hasNext()) {
                String word = wordScanner.next();
                if (!dictionary.found(word)) {
                    System.out.printf("Line %4d: %s\n", count, word);
                }
            }
        }
    }
}
