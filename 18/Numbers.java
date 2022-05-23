import java.util.*;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;


public class Numbers {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner input = new Scanner(new File("numbers.txt"));
        
        while (input.hasNext()) {
            Integer number = input.nextInt();
            numbers.add(number);
        }
        System.out.println(numbers);
    }
}
