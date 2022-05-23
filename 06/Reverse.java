import java.util.*;

public class Reverse {

    public static void reverse(int[] numbers) {
	    for (int i = 0; i < numbers.length / 2; i++) {
	        int temp = numbers[i];
	        numbers[i] = numbers[numbers.length - 1 - i];
	        numbers[numbers.length - 1 - i] = temp;    
	    }
        System.out.println("Reversed array: " + Arrays.toString(numbers));
	}

    public static void main(String[] args) {
        int[] numbers = {11, 42, -5, 27, 0, 89};
        reverse(numbers);
    }
}
