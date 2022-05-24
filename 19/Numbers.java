import java.util.*;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;


public class Numbers {

    // Removes all elements with even values from the given list.
    public static void filterEvens(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            int n = list.get(i);
            if (n % 2 == 0) {
                list.remove(i);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner input = new Scanner(new File("numbers.txt"));
        
        while (input.hasNext()) {
            Integer number = input.nextInt();
            numbers.add(number);
        }
        System.out.println("Array List: " + numbers);
        filterEvens(numbers);
        System.out.println(numbers);
    }
}
