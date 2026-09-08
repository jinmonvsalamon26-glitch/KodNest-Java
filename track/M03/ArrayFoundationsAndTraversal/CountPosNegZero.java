
import java.util.Scanner;

public class CountPosNegZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                zero++;
            }
        }

        System.out.println(pos + " " + neg + " " + zero);
        scanner.close();
    }
}
