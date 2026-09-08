
import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int index = -1;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println(index);
        scanner.close();
    }
}
