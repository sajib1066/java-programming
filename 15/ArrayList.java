import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        int[] numbers = {11, 42, -5, 27, 0, 89};
        System.out.println("Array List: " + Arrays.toString(numbers));

        // reverse the array
        for (int i = 0; i < numbers.length / 2; i++) {
	        int temp = numbers[i];
	        numbers[i] = numbers[numbers.length - 1 - i];
	        numbers[numbers.length - 1 - i] = temp;    
	    }
        System.out.println("Reversed Array List: " + Arrays.toString(numbers));
    }
}
