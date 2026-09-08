
import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min + " " + max);

        scanner.close();
    }
}
