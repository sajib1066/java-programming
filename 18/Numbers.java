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
        System.out.println("Array List: " + numbers);
        
        double total = 0;

        for(int i=0; i<numbers.size(); i++){
        	total = total + numbers.get(i);
        }
        double average = total / numbers.size();
        System.out.println("Average: " + average);

        int highestNumber = Collections.max(numbers);
        int lowestNumber = Collections.min(numbers);

        System.out.println("Highest Number: " + highestNumber);
        System.out.println("Lowest Number: " + lowestNumber);

    }
}
