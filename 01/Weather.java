import java.util.*;

public class Weather {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();
        
        int[] temps = new int[days];        // array to store days' temperatures
        int sum = 0;

        for (int i = 0; i < days; i++) {    // read/store each day's temperature
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }
        double average = (double) sum / days;

        // report results
        System.out.printf("Average temp = %.1f\n", average);

        Arrays.sort(temps);
        System.out.println("Lowest temperature = " + temps[0]);
        System.out.println("Highest temperature = " + temps[temps.length-1]);
    }
}
