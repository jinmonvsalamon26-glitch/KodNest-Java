
import java.util.Scanner;

public class SumAndAvg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        int total = 0;
        double avg = 0.00;
        for (int i = 0; i <= arr.length - 1; i++) {
            total = arr[i] + total;
        }
        avg = (double) total / size;
        System.out.println(total);
        System.out.printf("%.2f\n", avg);

        scanner.close();
    }
}
