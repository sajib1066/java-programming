import java.util.*;

public class Swap {

    public static void swapAll(int[] a1, int[] a2) {
        for (int i = 0; i < a1.length; i++) {
            int temp = a1[i];
            a1[i] = a2[i];
            a2[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a1 = {12, 34, 56};
        int[] a2 = {20, 50, 80};
        System.out.println("a1: " + Arrays.toString(a1));
        System.out.println("a2: " + Arrays.toString(a2));
        swapAll(a1, a2);
        System.out.println("After Swap:");
        System.out.println("a1: " + Arrays.toString(a1));  // [20, 50, 80]
        System.out.println("a2: " + Arrays.toString(a2));  // [12, 34, 56]
    }
}
