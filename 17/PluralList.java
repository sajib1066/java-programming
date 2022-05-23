import java.util.*;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;



public class PluralList {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> allWords = new ArrayList<String>();
        Scanner input = new Scanner(new File("words.txt"));
        
        while (input.hasNext()) {
            String word = input.next();
            allWords.add(word);
        }

        // remove all plural words
        for (int i = 0; i < allWords.size(); i++) {
            String word = allWords.get(i);
            if (word.endsWith("s")) {
                allWords.remove(i);
                i--;
            }
        }
        System.out.println(allWords);
    }
}
